package com.rafamompo.tema4gradle;

public class ValidadorContraseñas {

    public static String evaluarPassword(String password) {

        int puntos = 0;

        if (password.length() >= 8) puntos++;

        if (password.matches(".*[A-Z].*")) puntos++;

        if (password.matches(".*[a-z].*")) puntos++;

        if (password.matches(".*\\d.*")) puntos++;

        if (password.matches(".*[^A-Za-z0-9].*")) puntos++;

        if (puntos <= 2) return "DEBIL";
        if (puntos <= 4) return "MEDIA";
        return "FUERTE";
    }
}
