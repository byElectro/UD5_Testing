package com.rafamompo.tema4gradle;

public class Bisiesto {

    public static boolean esBisiesto(int anyo) {
        return (anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0);
    }
}
