package com.rafamompo.tema4gradle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EdadTest {

    @Test
    void testEdadNegativa() {
        assertThrows(IllegalArgumentException.class, () -> Edad.clasificarEdad(-5));
    }

    @Test
    void testInfancia() {
        assertEquals("Infancia", Edad.clasificarEdad(3));
    }

    @Test
    void testVejez() {
        assertEquals("Vejez", Edad.clasificarEdad(80));
    }
}