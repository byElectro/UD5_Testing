package com.rafamompo.tema4gradle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EsBisiestoTest {

    //Divisible por 4 y no por 100 → TRUE
    @Test
    void testDivisiblePor4NoPor100() {
        assertTrue(Bisiesto.esBisiesto(2024)); // 2024 % 4 == 0 y %100 != 0
    }

    //Divisible por 100 pero no por 400 → FALSE
    @Test
    void testDivisiblePor100NoPor400() {
        assertFalse(Bisiesto.esBisiesto(1900)); // 1900 % 100 == 0 y %400 != 0
    }

    //Divisible por 400 → TRUE
    @Test
    void testDivisiblePor400() {
        assertTrue(Bisiesto.esBisiesto(2000)); // 2000 % 400 == 0
    }

    //No divisible por 4 → FALSE
    @Test
    void testNoDivisiblePor4() {
        assertFalse(Bisiesto.esBisiesto(2023)); // 2023 % 4 != 0
    }
}