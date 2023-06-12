package org.example;

public class Main {
    public static void main(String[] args) {
        //String nombre = "Cristian";
        //nombre = "Lucía";
        //System.out.println("Hello " + nombre);

        // Ejercicio: Realizar tabla de multiplicar de un número
        // (Ciclos For y While)

        //final int numero = 5;

        //for(int i = 0; i <= 10; i++){
        //    System.out.println(numero + " * " + i + " = " + (numero * i));
        //}

        final int numero2 = 10;
        int i = 0;
        // Este while solo se ejecutará cuando el valor de "i" es par
        while (i <= 10){
            if (i % 2 == 0){
                System.out.println(numero2 + " * " + i + " = " + (numero2 * i));
            }
            i++;
        }
    }
}