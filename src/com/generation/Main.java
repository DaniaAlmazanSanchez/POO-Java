package com.generation;

public class Main {

    public static void main(String[] args) {

    Perro cachorro = new Perro();
    cachorro.nombre = "chems";
    cachorro.edad = 1;
    cachorro.raza = "wrade";
    cachorro.tamanio ="grande";
    cachorro.caracteristicas();

    Perro cachorro2 = new Perro();
        cachorro2.nombre = "firulais";
        cachorro2.edad = 1;
        cachorro2.raza = "pug";
        cachorro2.tamanio = "chico";
        cachorro2.caracteristicas();
        cachorro2.comer();
  }
}

