package com.rafamompo.tema4gradle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    private String nombre;
    @BeforeEach
    void setUp(){

    }

    @Test
    void curarSumaVida(){
        Player jugador = new Player("Yasuo", 10, 20);
        jugador.curar(20);
        assertEquals(30, jugador.getVida());

    }

    // curar a un muerto no funciona

    @Test
    void curarMuertoNoFunciona(){
        Player jugador = new Player("Yasuo", 0, 20);

        jugador.curar(20);
        assertEquals(0, jugador.getVida());
        if (jugador.getVida() <= 0) {
            System.out.println("No se puede curar a un jugador muerto.");
        }

    }

    @Test
    void curarNoCuraVidaMaxima(){

        Player jugador = new Player("Yasuo", 95, 50);
        jugador.curar(6);
        assertEquals(100, jugador.getVida());
    }

    @Test
    void constructorNoDejaVidaNegativa(){

        //Esto es para que lance una excepcion cuando el objeto que este creando, si tiene un valor de vida negativa, salte la excepcion
        assertThrows(IllegalArgumentException.class,
                () -> new Player("Yasuo", -10, 50));


    }

    @Test
    void constructorNoDejaAtaqueNegativo(){

        //Esto es para que lance una excepcion cuando el objeto que este creando, si tiene un valor de daño negativo,salte la excepcion
        assertThrows(IllegalArgumentException.class,
                () -> new Player("Yasuo", 10, -10));


    }

    @Test
    void constructorInicializaCamposCorrectamente(){

        /*
        assertEquals( "Yasuo", jugador.getNombre());
        assertEquals(95, jugador.getVida());
        assertEquals(50, jugador.getAtaque());
        */

        //fORMA mas correcta
        String nombre = "Yasuo";
        int vida = 95;
        int ataque = 50;

        Player jugador = new Player(nombre, vida, ataque);
        assertEquals( nombre, jugador.getNombre());
        assertEquals(vida, jugador.getVida());
        assertEquals(ataque, jugador.getAtaque());


    }

    @Test
    void recibirDanyoReduceVida(){

        String nombre = "Yasuo";
        int vida = 95;
        int ataque = 50;

        Player jugador = new Player(nombre, vida, ataque);

        jugador.recibirDanyo(20);
        assertEquals(75, jugador.getVida());
    }



}