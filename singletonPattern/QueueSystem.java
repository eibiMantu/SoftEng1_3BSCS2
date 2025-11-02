import java.util.concurrent.atomic.AtomicInteger;


public class QueueSystem {
    private static volatile QueueSystem instance;
    private final AtomicInteger current;

    private QueueSystem() {
        this.current = new AtomicInteger(0);
    }

    public static QueueSystem getInstance() {
        if (instance == null) {
            synchronized (QueueSystem.class) {
                if (instance == null) {
                    instance = new QueueSystem();
                }
            }
        }
        return instance;
    }

    /**
     * Returns the current queue number without changing it.
     */
    public int getCurrent() {
        return current.get();
    }

    /**
     * Increments the centralized queue number and returns the new value.
     * This is the single source of truth for all help desk stations.
     */
    public int next() {
        return current.incrementAndGet();
    }

    /**
     * Reset the centralized queue number to the given value.
     * Synchronized to avoid races with concurrent increments.
     */
    public synchronized void reset(int newNumber) {
        current.set(newNumber);
    }
}
