package org.example;

public class Animal {

    // Propiedades/Caracteristicas
    protected String nombre;
    protected String raza;
    protected int altura;
    protected int edad;

    // Comportamientos/Métodos

    public String comunicarse(){
        return "Soy un animal";
    }

    // Metodo/s Constructor/es

    public Animal(String nombre, String raza, int altura, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.altura = altura;
        this.edad = edad;
    }


    // Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
