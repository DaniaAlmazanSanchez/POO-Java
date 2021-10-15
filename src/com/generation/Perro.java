package com.generation;

public class Perro {

        String nombre;
        String raza;
        String tamanio;
        int edad;

        public void caracteristicas(){
            System.out.println("nombre:" + this.nombre + "\nraza:" + this.raza + "\ntamaño" + this.tamanio + "\nedad:" + this.edad);
        }
        public void comer(){

            System.out.println("me encanta la carne");
        }
        public void dormir(){
            System.out.println("me gusta dormir");
        }
        public void jugar(){
            System.out.println("me encanta jugar");

        }


}
