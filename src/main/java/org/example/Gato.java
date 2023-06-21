package org.example;

public class Gato extends Animal{
    private int cantBigotes;

    public Gato(String nombre, String raza, int altura, int edad){
        super(nombre, raza, altura, edad);
    }

    public String comunicarse(){
        return "Miau";
    }
}
