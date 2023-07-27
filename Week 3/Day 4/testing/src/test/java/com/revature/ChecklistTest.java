package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class ChecklistTest {
    
    // dummy
    private Checklist list = new Checklist();

    @BeforeEach
    public void listSetUp() {
        list.createTask("do laundry");
        list.createTask("exercise");
        list.toggleTask("exercise");
        list.createTask("make dinner");
    }

    @Test
    public void test_createTask_adds_task_to_list() {
        // arrange
        String name = "clean floor";

        // act
        boolean result = list.createTask(name);

        // assert
        assertEquals(true, result);
    }

    @Test
    public void test_createTask_fails_because_name_is_whitespace() {
        assertThrows(IllegalArgumentException.class, () -> list.createTask(" "));
    }

    @Test
    public void test_removeTask_returns_true() {
        // arrange

        // act
        boolean result = list.removeTask("do laundry");

        // assert
        assertTrue(result);
    }

    @Test
    public void test_removeTask_returns_false() {
        // arrange

        // act
        boolean result = list.removeTask("wash car");

        // assert
        assertFalse(result);
    }
}
