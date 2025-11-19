package br.com.danilors.flyweight;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class ForestSimulationTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testFlyweightSharing() {
        List<Tree> forest = new ArrayList<>();

        // Create multiple trees, but only two unique types
        forest.add(new Tree(1, 1, TreeFactory.getTreeType("Oak", "Green", "Rough Bark")));
        forest.add(new Tree(2, 2, TreeFactory.getTreeType("Pine", "Dark Green", "Needle-like Leaves")));
        forest.add(new Tree(3, 3, TreeFactory.getTreeType("Oak", "Green", "Rough Bark"))); // Should reuse existing OakType
        forest.add(new Tree(4, 4, TreeFactory.getTreeType("Pine", "Dark Green", "Needle-like Leaves"))); // Should reuse existing PineType
        forest.add(new Tree(5, 5, TreeFactory.getTreeType("Oak", "Green", "Rough Bark"))); // Should reuse existing OakType

        // Verify that only two unique TreeType objects were created
        assertEquals(2, TreeFactory.getNumberOfTreeTypes(), "Only two unique tree types should be created");

        // Verify that the shared instances are indeed the same objects
        TreeType oak1 = TreeFactory.getTreeType("Oak", "Green", "Rough Bark");
        TreeType oak2 = TreeFactory.getTreeType("Oak", "Green", "Rough Bark");
        assertSame(oak1, oak2, "Oak tree types should be the same instance");

        TreeType pine1 = TreeFactory.getTreeType("Pine", "Dark Green", "Needle-like Leaves");
        TreeType pine2 = TreeFactory.getTreeType("Pine", "Dark Green", "Needle-like Leaves");
        assertSame(pine1, pine2, "Pine tree types should be the same instance");

        // Draw all trees and check output
        for (Tree tree : forest) {
            tree.draw();
        }

        String expectedOutput = "Drawing Oak tree at (1, 1) with color Green and texture Rough Bark\n" +
                                "Drawing Pine tree at (2, 2) with color Dark Green and texture Needle-like Leaves\n" +
                                "Drawing Oak tree at (3, 3) with color Green and texture Rough Bark\n" +
                                "Drawing Pine tree at (4, 4) with color Dark Green and texture Needle-like Leaves\n" +
                                "Drawing Oak tree at (5, 5) with color Green and texture Rough Bark\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testNewTreeTypeCreation() {
        // Ensure factory starts clean for this test
        // (Note: In a real scenario, you might reset the factory or use a different approach for isolated tests)
        // For this example, we'll just add a new type
        TreeFactory.getTreeType("Maple", "Red", "Smooth Bark");
        assertEquals(1, TreeFactory.getNumberOfTreeTypes(), "One new tree type should be created");
    }
}
