/**
 * Subscriber class - Observer in the Observer Pattern
 * Represents users/entities subscribed to the news service
 * Receives immediate notifications about breaking news
 */
public class subscribers {
    private String name;
    private String preferences; // For future enhancement (e.g., sports, politics, tech)
    
    /**
     * Constructor initializes subscriber with name and preferences
     * @param name The subscriber's name
     * @param preferences The subscriber's news preferences
     */
    public subscribers(String name, String preferences) {
        this.name = name;
        this.preferences = preferences;
    }
    
    /**
     * Alternate constructor with just name
     * @param name The subscriber's name
     */
    public subscribers(String name) {
        this(name, "General");
    }
    
    /**
     * Called by the NewsAgency when new news is published
     * @param news The news update received
     */
    public void update(String news) {
        System.out.println("[" + name + "] (" + preferences + ") received: " + news);
    }
    
    /**
     * Returns the subscriber's name
     * @return The name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns the subscriber's preferences
     * @return The preferences
     */
    public String getPreferences() {
        return preferences;
    }
    
    /**
     * Updates subscriber's preferences dynamically
     * @param preferences The new preferences
     */
    public void setPreferences(String preferences) {
        this.preferences = preferences;
        System.out.println("[" + name + "] preferences updated to: " + preferences);
    }
}
