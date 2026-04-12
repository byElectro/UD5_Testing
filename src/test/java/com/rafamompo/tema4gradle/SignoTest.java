package com.rafamompo.tema4gradle;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SignoTest {

    @Test
    void testSignoPositivo() {
        assertEquals(1, Main.signo(7));
    }

    @Test
    void testSignoNegativo() {
        assertEquals(-1, Main.signo(-3));
    }

    @Test
    void testSignoCero() {
        assertEquals(0, Main.signo(0));
    }

}