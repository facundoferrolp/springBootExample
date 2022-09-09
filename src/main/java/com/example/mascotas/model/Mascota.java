package com.example.mascotas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    public String nombre;
    public String nombreDeDuenio;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String campoUno) {
        this.nombre = campoUno;
    }

    public String getNombreDeDuenio() {
        return nombreDeDuenio;
    }

    public void setNombreDeDuenio(String campoDos) {
        this.nombreDeDuenio = campoDos;
    }

    public Mascota(long id, String campoUno, String campoDos) {
        this.id = id;
        this.nombre = campoUno;
        this.nombreDeDuenio = campoDos;
    }

    public Mascota(String campoUno, String campoDos) {
        this.nombre = campoUno;
        this.nombreDeDuenio = campoDos;
    }
    public Mascota() {
    }

}

