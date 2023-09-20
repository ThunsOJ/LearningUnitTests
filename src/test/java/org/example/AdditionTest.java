package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    Addition addition = new Addition();

    @Test
    void calculate() {
        int a = 3, b = 4;
        assertEquals(a + b, addition.calculate(a,b));
        assertNotEquals(a - b, addition.calculate(a, b));
    }
}