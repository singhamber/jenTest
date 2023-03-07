package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @Test
    void add() {
        String parameter = System.getProperty("Parameter");
        assertEquals("Param", parameter);
        Operations operations = new Operations();
        int add = operations.add(1, 4);
        assertEquals(5, add);
    }
}