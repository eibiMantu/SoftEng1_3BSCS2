/**
 * ViewerApp class - Demonstrates the Observer Pattern implementation
 * Shows subscription management, dynamic updates, and decoupled communication
 */
public class ViewerApp {
    public static void main(String[] args) {
        // Create the news agency (Subject)
        newsAgency agency = new newsAgency();
        
        // Requirement 1: Subscription Management
        System.out.println("========== SUBSCRIPTION MANAGEMENT ==========\n");
        
        // Create subscribers (Observers)
        subscribers subscriber1 = new subscribers("Alice", "Sports");
        subscribers subscriber2 = new subscribers("Bob", "Technology");
        subscribers subscriber3 = new subscribers("Charlie", "General");
        subscribers subscriber4 = new subscribers("Diana", "Politics");
        
        // Subscribe to the news service
        System.out.println("--- Initial Subscriptions ---");
        agency.attach(subscriber1);
        agency.attach(subscriber2);
        agency.attach(subscriber3);
        agency.attach(subscriber4);
        
        System.out.println();
        
        // Requirement 2: Publishing news and notifying subscribers
        System.out.println("========== PUBLISHING NEWS ==========\n");
        agency.publishNews("Breaking: New breakthrough in renewable energy!");
        
        System.out.println();
        
        // Requirement 3: Dynamic Subscription Updates
        System.out.println("========== DYNAMIC SUBSCRIPTION UPDATES ==========\n");
        
        // New subscriber joins
        System.out.println("--- New Subscriber Joins ---");
        subscribers subscriber5 = new subscribers("Eve", "Business");
        agency.attach(subscriber5);
        System.out.println();
        
        // Publish news with the new subscriber
        agency.publishNews("Market Update: Tech stocks surge 5% today!");
        System.out.println();
        
        // Update preferences dynamically
        System.out.println("--- Subscriber Preference Update ---");
        subscriber1.setPreferences("Sports & Technology");
        System.out.println();
        
        // Subscriber unsubscribes
        System.out.println("--- Subscriber Leaves ---");
        agency.detach(subscriber3);
        System.out.println();
        
        // Publish news without the unsubscribed user
        agency.publishNews("Weather Alert: Severe storm expected this weekend!");
        System.out.println();
        
        // Requirement 4: Decoupled Communication
        System.out.println("========== DECOUPLED COMMUNICATION DEMONSTRATION ==========\n");
        System.out.println("Note: Subscribers don't request updates, the NewsAgency pushes them!");
        System.out.println("This ensures loose coupling and independent evolution.\n");
        
        // Publish multiple news items
        agency.publishNews("Sports: National championship finals begin tomorrow!");
        System.out.println();
        
        agency.publishNews("Science: New exoplanet discovery shows signs of water!");
        System.out.println();
        
        // Requirement 5: Scalability demonstration
        System.out.println("========== SCALABILITY TEST ==========\n");
        System.out.println("Adding 10 more subscribers...");
        for (int i = 1; i <= 10; i++) {
            agency.attach(new subscribers("Subscriber" + i, "Category" + i));
        }
        System.out.println("Total subscribers now: " + agency.getSubscriberCount());
        System.out.println();
        
        // Large-scale notification test
        System.out.println("--- Publishing news to all " + agency.getSubscriberCount() + " subscribers ---");
        agency.publishNews("Emergency Alert: All systems operational!");
        System.out.println();
        
        // Final statistics
        System.out.println("========== FINAL STATISTICS ==========");
        System.out.println("Final subscriber count: " + agency.getSubscriberCount());
        System.out.println("Latest news: " + agency.getLatestNews());
    }
}
