
public class QueueDemo {
    public static void main(String[] args) throws InterruptedException {
        Monitor monitor = new Monitor(1000);
        Thread monitorThread = new Thread(monitor, "Monitor");
        monitorThread.setDaemon(true);
        monitorThread.start();

        // Create three stations. Station-2 will perform a reset in the middle of its run.
        Thread s1 = new Thread(new HelpDeskStation("Station-1", 6, false, 0));
        Thread s2 = new Thread(new HelpDeskStation("Station-2", 8, true, 50));
        Thread s3 = new Thread(new HelpDeskStation("Station-3", 5, false, 0));

        s1.start();
        s2.start();
        s3.start();

        // Wait for stations to finish
        s1.join();
        s2.join();
        s3.join();

        // Give monitor a short moment then stop
        Thread.sleep(1200);
        monitor.stop();
        // Ensure monitor thread exits
        monitorThread.join(2000);

        System.out.println("Demo finished.");
    }
}
