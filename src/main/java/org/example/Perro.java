package org.example;

public class Perro extends Animal{
    public Perro(String nombre, String raza, int altura, int edad) {
        super(nombre, raza, altura, edad);
    }

    // Sobreescritura del metodo comunicarse
    public String comunicarse(){
        return "Guau";
    }
}
