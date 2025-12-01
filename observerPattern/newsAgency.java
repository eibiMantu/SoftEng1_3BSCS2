import java.util.ArrayList;
import java.util.List;

/**
 * NewsAgency class - Subject in the Observer Pattern
 * Maintains a list of subscribers and notifies them of news updates
 */
public class newsAgency {
    private List<subscribers> subscribers;
    private String latestNews;
    
    /**
     * Constructor initializes the subscriber list
     */
    public newsAgency() {
        this.subscribers = new ArrayList<>();
        this.latestNews = "";
    }
    
    /**
     * Subscribes a user/subscriber to the news service
     * @param subscriber The subscriber to add
     */
    public void attach(subscribers subscriber) {
        if (!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
            System.out.println("New subscriber added. Total subscribers: " + subscribers.size());
        }
    }
    
    /**
     * Unsubscribes a user/subscriber from the news service
     * @param subscriber The subscriber to remove
     */
    public void detach(subscribers subscriber) {
        if (subscribers.remove(subscriber)) {
            System.out.println("Subscriber removed. Total subscribers: " + subscribers.size());
        }
    }
    
    /**
     * Publishes breaking news to all subscribers
     * @param news The news to publish
     */
    public void publishNews(String news) {
        this.latestNews = news;
        System.out.println("\n=== NEWS ALERT ===");
        System.out.println("Breaking News: " + news);
        System.out.println("Notifying " + subscribers.size() + " subscriber(s)...\n");
        notifyObservers();
    }
    
    /**
     * Notifies all subscribed observers about the latest news
     */
    public void notifyObservers() {
        for (subscribers subscriber : subscribers) {
            subscriber.update(latestNews);
        }
    }
    
    /**
     * Returns the latest published news
     * @return The latest news
     */
    public String getLatestNews() {
        return latestNews;
    }
    
    /**
     * Returns the number of current subscribers
     * @return The subscriber count
     */
    public int getSubscriberCount() {
        return subscribers.size();
    }
}
