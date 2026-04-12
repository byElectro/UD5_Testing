package com.rafamompo.tema4gradle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalificacionTest {


    @Test
    void testNotaInvalida() {
        assertThrows(IllegalArgumentException.class, () -> Calificacion.calificacion(-1));
    }

    @Test
    void testSuspenso() {
        assertEquals("SUSPENSO", Calificacion.calificacion(3));
    }

    @Test
    void testSuficiente() {
        assertEquals("SUFICIENTE", Calificacion.calificacion(5));
    }

    @Test
    void testBien() {
        assertEquals("BIEN", Calificacion.calificacion(6));
    }

    @Test
    void testNotable() {
        assertEquals("NOTABLE", Calificacion.calificacion(7));
    }

    @Test
    void testSobresaliente() {
        assertEquals("SOBRESALIENTE", Calificacion.calificacion(10));
    }
}

