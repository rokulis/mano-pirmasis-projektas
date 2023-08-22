package org.example;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestMain {

    // This method runs once before any of the test methods in the class.
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Setting up before all tests.");
        System.out.println("Setting up before all tests.");
    }

    // This method runs once after all the test methods in the class.
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("Tearing down after all tests.");
    }

    // This method is executed before each test. It's used to prepare the test environment (e.g., read input data, initialize the class).
    @Before
    public void setUp() throws Exception {
        System.out.println("Setting up before a test.");
    }

    // This method is executed after each test. It's used to cleanup the test environment (e.g., delete temporary data, restore defaults).
    @After
    public void tearDown() throws Exception {
        System.out.println("Tearing down after a test.");
    }

    // Test case 1
    @Test
    public void testAddition() {
        System.out.println("Running testAddition.");
        assertEquals(5, 3 + 2);
    }

    // Test case 2
    @Test
    public void testAddition2() {
        System.out.println("Running testAddition2.");
        assertEquals(5, 3 + 2);
    }

}
