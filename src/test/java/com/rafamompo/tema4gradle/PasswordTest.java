package com.rafamompo.tema4gradle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordTest {

    @Test
    void testDebil() {
        assertEquals("DEBIL", ValidadorContraseñas.evaluarPassword("abc"));
    }

    @Test
    void testMedia() {
        assertEquals("MEDIA", ValidadorContraseñas.evaluarPassword("Abc12345"));
    }

    @Test
    void testFuerte() {
        assertEquals("FUERTE", ValidadorContraseñas.evaluarPassword("Abc123$%"));
    }

    @Test
    void testSoloNumeros() {
        assertEquals("DEBIL", ValidadorContraseñas.evaluarPassword("12345678"));
    }
}