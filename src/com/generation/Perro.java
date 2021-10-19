package com.generation;

public class Perro {

        String nombre;
        String raza;
        String tamanio;
        int edad;
        //contructor que inicialza mi objeto perro
        public Perro(){

        }

        public Perro(String raza){
            this.raza = raza;
        }
        public Perro(String nombre, String raza){
                this.nombre = nombre;
                this.raza = raza;
        }
        public Perro(String nombre, String raza, String tamanio, int edad){
                this.nombre = nombre;
                this.raza = raza;
                this.tamanio = tamanio;
                this.edad = edad;
        }
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
