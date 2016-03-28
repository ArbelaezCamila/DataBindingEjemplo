package com.camila.databinding19032016;

/**
 * Created by Usuario on 19/03/2016.
 */
public class User {
    public final String nombre;
    public final String apellido;



    public String getNombre() {
        return nombre;
    }

    public User(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }
}