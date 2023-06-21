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

        //final int numero2 = 10;
        //int i = 0;
        // Este while solo se ejecutará cuando el valor de "i" es par
        //while (i <= 10){
        //    if (i % 2 == 0){
        //        System.out.println(numero2 + " * " + i + " = " + (numero2 * i));
        //    }
        //    i++;
        //}


        //Alumno alumno1 = new Alumno(111111, "John", "Doe", 1);
        //Alumno alumno2 = new Alumno();

        //System.out.println("El alumno 1 se llama " + alumno1.getNombre());
        //System.out.println("El alumno 2 se llama " + alumno2.getNombre());

        //alumno2.setNombre("Cristian");
        //alumno2.setApellido("Gadea");
        //alumno2.setDni(1324534);
        //alumno2.setLegajo(2);

        //alumno1.setNombre("Micaela");

        //System.out.println("El alumno 2 se llama " + alumno2.getNombre());
        //System.out.println("Ahora la alumna 1 se llama " + alumno1.getNombre());



        Perro perro1 = new Perro("Firulais","caniche", 10,1);
        Gato gato1 = new Gato("Michi", "mestiza", 10, 2);

        System.out.println("Creamos un perro llamado " + perro1.getNombre());
        System.out.println("Creamos un gato llamado " + gato1.getNombre());

        System.out.println(perro1.comunicarse());
        System.out.println(gato1.comunicarse());


    }
}