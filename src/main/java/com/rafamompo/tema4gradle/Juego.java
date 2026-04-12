package com.rafamompo.tema4gradle;

public class Juego {

    public static String jugar(String jugador1, String jugador2) {

        // Validación de entradas
        if (!jugador1.equals("PIEDRA") && !jugador1.equals("PAPEL") && !jugador1.equals("TIJERA") ||
                !jugador2.equals("PIEDRA") && !jugador2.equals("PAPEL") && !jugador2.equals("TIJERA")) {
            throw new IllegalArgumentException("Jugada no válida");
        }

        // Empate
        if (jugador1.equals(jugador2)) {
            return "EMPATE";
        }

        // Reglas del juego
        if (jugador1.equals("PIEDRA") && jugador2.equals("TIJERA")) return "JUGADOR1";
        if (jugador1.equals("TIJERA") && jugador2.equals("PAPEL")) return "JUGADOR1";
        if (jugador1.equals("PAPEL") && jugador2.equals("PIEDRA")) return "JUGADOR1";

        return "JUGADOR2";
    }
}
