package org.example;

public class Alumno {
    //dni,nombre,apellido,legajo

    // modificador de acceso + tipo de dato + nombre de la caracteristica\

    // Por convención, las propiedades de una Clase son privadas
    // y pueden ser accedidas por métodos públicos

    private int dni;

    private String nombre;

    private String apellido;

    private int legajo;



    // Funciones preestablecidas

    // Metodo Constructor

    public Alumno(int dni, String nombre, String apellido, int legajo){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public Alumno(){
        this.nombre = "";
        this.apellido = "";
        this.dni = 0;
        this.legajo = 0;
    }

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters y Setters

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    //registro,login,inscribirACurso

    // Para definir los comportamientos/ metodos en Java
    // debemos crear una función

    // mod. de acceso + Tipo de dato (Clases) de retorno + nombre de la funcion
    // + parametros () {}
    // Por convención, las funciones en Java suelen ser públicas

    public Boolean registro(String nombre, String apellido, int dni){
        return true;
    }

}
