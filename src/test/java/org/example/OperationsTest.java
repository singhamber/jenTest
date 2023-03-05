package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @Test
    void add() {
        Operations operations = new Operations();
        int add = operations.add(1, 2);
        assertEquals(3, add);
    }
}