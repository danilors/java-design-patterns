package br.com.danilors.singleton;

/**
 * The ConfigurationManager is a Singleton that ensures only one instance of configuration settings
 * exists throughout the application, providing a global point of access to these settings.
 */
public class ConfigurationManager {

    private static ConfigurationManager instance;
    private String logLevel;
    private String databaseUrl;

    /**
     * Private constructor to prevent direct instantiation.
     * Initializes default configuration settings.
     */
    private ConfigurationManager() {
        this.logLevel = "INFO";
        this.databaseUrl = "jdbc:mysql://localhost:3306/appdb";
    }

    /**
     * Returns the singleton instance of the ConfigurationManager.
     * If no instance exists, a new one is created.
     *
     * @return the singleton instance of ConfigurationManager
     */
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    /**
     * Gets the current log level.
     * @return the current log level
     */
    public String getLogLevel() {
        return logLevel;
    }

    /**
     * Sets the log level.
     * @param logLevel the new log level
     */
    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
        System.out.println("Log level set to: " + logLevel);
    }

    /**
     * Gets the current database URL.
     * @return the current database URL
     */
    public String getDatabaseUrl() {
        return databaseUrl;
    }

    /**
     * Sets the database URL.
     * @param databaseUrl the new database URL
     */
    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
        System.out.println("Database URL set to: " + databaseUrl);
    }

    /**
     * Displays all current configuration settings.
     */
    public void displaySettings() {
        System.out.println("Current Configuration:");
        System.out.println("  Log Level: " + logLevel);
        System.out.println("  Database URL: " + databaseUrl);
    }
}
