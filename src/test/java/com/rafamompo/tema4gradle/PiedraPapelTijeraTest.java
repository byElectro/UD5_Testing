package com.rafamompo.tema4gradle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PiedraPapelTijeraTest {

    @Test
    void testEmpate() {
        assertEquals("EMPATE", Juego.jugar("PIEDRA", "PIEDRA"));
    }

    @Test
    void testGanaJugador1() {
        assertEquals("JUGADOR1", Juego.jugar("PIEDRA", "TIJERA"));
    }

    @Test
    void testGanaJugador2() {
        assertEquals("JUGADOR2", Juego.jugar("PIEDRA", "PAPEL"));
    }

    @Test
    void testGanaJugador1Caso2() {
        assertEquals("JUGADOR1", Juego.jugar("TIJERA", "PAPEL"));
    }

    @Test
    void testEntradaInvalida() {
        assertThrows(IllegalArgumentException.class,
                () -> Juego.jugar("PIEDRA", "LAGARTO"));
    }
}