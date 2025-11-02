import java.util.Random;


public class HelpDeskStation implements Runnable {
    private final String name;
    private final int callsToMake;
    private final boolean willReset;
    private final int resetValue;

    public HelpDeskStation(String name, int callsToMake, boolean willReset, int resetValue) {
        this.name = name;
        this.callsToMake = callsToMake;
        this.willReset = willReset;
        this.resetValue = resetValue;
    }

    @Override
    public void run() {
        QueueSystem queue = QueueSystem.getInstance();
        Random rnd = new Random();
        for (int i = 0; i < callsToMake; i++) {
            try {
                Thread.sleep(500 + rnd.nextInt(800));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }

            int number = queue.next();
            System.out.println("[" + name + "] serving number " + number);

            // Demonstrate reset capability once during the run if configured
            if (willReset && i == callsToMake / 2) {
                System.out.println("[" + name + "] resetting queue to " + resetValue);
                queue.reset(resetValue);
            }
        }
        System.out.println("[" + name + "] finished serving.");
    }
}
