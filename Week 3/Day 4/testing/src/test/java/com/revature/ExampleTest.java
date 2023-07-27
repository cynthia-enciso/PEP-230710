package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class ExampleTest {
    
    @BeforeAll
    public static void beforeAllSetup() {
        System.out.println("Before all!");
    }

    @BeforeEach
    public void beforeEachSetUp() {
        System.out.println("Before each called!");
    }

    @AfterEach
    public void tearDownAfterEach() {
        System.out.println("After each called!");
    }

    @AfterAll
    public static void tearDownAfterAll() {
        System.out.println("After all!");
    }

    @Test
    public void testOne() {
        System.out.println("test 1!");
        assertTrue(true);
    }

    @Test
    public void testTwo() {
        System.out.println("test 2!");
        assertTrue(true);
    }
}
