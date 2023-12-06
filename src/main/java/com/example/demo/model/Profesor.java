
package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Profesor {
    @Id
    private Integer id;
    private String nombre;
    private String apellido;
    private int edad;
    private Float sueldo;
    private int añosdeexperiencia;
    private String telefono;

    public Profesor(Integer id, String nombre, String apellido, int edad, Float sueldo, int añosdeexperiencia, String telefono) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sueldo = sueldo;
        this.añosdeexperiencia = añosdeexperiencia;
        this.telefono = telefono;
    }
    public Profesor() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Float getSueldo() {
        return sueldo;
    }

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }

    public int getAñosdeexperiencia() {
        return añosdeexperiencia;
    }

    public void setAñosdeexperiencia(int añosdeexperiencia) {
        this.añosdeexperiencia = añosdeexperiencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
