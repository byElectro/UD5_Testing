package com.rafamompo.tema4gradle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContadorPositivosTest {

    @Test
    void testArrayVacio() {
        assertEquals(0, Contador.contarPositivos(new int[]{}));
    }

    @Test
    void testTodosNegativos() {
        assertEquals(0, Contador.contarPositivos(new int[]{-1, -2, -3}));
    }

    @Test
    void testMezcla() {
        assertEquals(2, Contador.contarPositivos(new int[]{-1, 0, 5, 2}));
    }
}