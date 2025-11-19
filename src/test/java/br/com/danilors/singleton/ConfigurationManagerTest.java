package br.com.danilors.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class ConfigurationManagerTest {

    @Test
    void testSingletonInstance() {
        ConfigurationManager manager1 = ConfigurationManager.getInstance();
        ConfigurationManager manager2 = ConfigurationManager.getInstance();

        // Verify that both instances are the same
        assertNotNull(manager1);
        assertNotNull(manager2);
        assertSame(manager1, manager2, "Both instances should be the same");
    }

    @Test
    void testConfigurationSettings() {
        ConfigurationManager manager = ConfigurationManager.getInstance();

        // Test initial default settings
        assertEquals("INFO", manager.getLogLevel(), "Initial log level should be INFO");
        assertEquals("jdbc:mysql://localhost:3306/appdb", manager.getDatabaseUrl(), "Initial database URL should be the default");

        // Change settings
        manager.setLogLevel("DEBUG");
        manager.setDatabaseUrl("jdbc:postgresql://localhost:5432/newdb");

        // Verify changed settings
        assertEquals("DEBUG", manager.getLogLevel(), "Log level should be updated to DEBUG");
        assertEquals("jdbc:postgresql://localhost:5432/newdb", manager.getDatabaseUrl(), "Database URL should be updated");

        // Get another instance and verify it has the updated settings
        ConfigurationManager anotherManager = ConfigurationManager.getInstance();
        assertEquals("DEBUG", anotherManager.getLogLevel(), "Another instance should reflect updated log level");
        assertEquals("jdbc:postgresql://localhost:5432/newdb", anotherManager.getDatabaseUrl(), "Another instance should reflect updated database URL");
    }
}
