package com.emergentes.modelo;

public class Persona {
    private int id;
    private String nombres;
    private String apellidos;
    private int edad;

    public Persona() {
        this.id = 0;
        this.nombres = "";
        this.apellidos = "";
        this.edad = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }
}
