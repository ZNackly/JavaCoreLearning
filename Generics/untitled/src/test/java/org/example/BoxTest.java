package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {
    @Test
    public void testBox() {
        Box<Integer> box1 = new Box<>(10);
        Box<Integer> box2 = new Box<>(20);
        int expected = 30;
        int result = (int) box1.getObject() + (int) box2.getObject();
        assertEquals(expected, result);
    }
}