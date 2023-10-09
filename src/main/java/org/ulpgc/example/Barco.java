package org.ulpgc.example;

import java.io.Serializable;

public class Barco implements Serializable {
    private int palos;
    private int eslora;
    private String nombre;

    public Barco(int palos, int eslora, String nombre) {
        this.palos = palos;
        this.eslora = eslora;
        this.nombre = nombre;
    }
}