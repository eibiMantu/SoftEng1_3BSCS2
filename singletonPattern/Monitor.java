/**
 * Simple monitor that polls the QueueSystem.current value periodically and prints it.
 * This simulates an online monitoring display that shows the current queued number in real-time.
 */
public class Monitor implements Runnable {
    private final long pollMillis;
    private volatile boolean running = true;

    public Monitor(long pollMillis) {
        this.pollMillis = pollMillis;
    }

    public void stop() {
        running = false;
    }

    @Override
    public void run() {
        QueueSystem queue = QueueSystem.getInstance();
        while (running) {
            System.out.println("[Monitor] current queue number: " + queue.getCurrent());
            try {
                Thread.sleep(pollMillis);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        System.out.println("[Monitor] stopped.");
    }
}
