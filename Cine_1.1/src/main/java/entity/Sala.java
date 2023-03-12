/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


public class Sala {
       @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private long id;
    private String costo;
    private String fecha;
    private String max_personas;
    private String Sala;
    
    @ManyToOne
    @JoinColumn(name="Pelicula_id")
    private Pelicula pelicula;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMax_personas() {
        return max_personas;
    }

    public void setMax_personas(String max_personas) {
        this.max_personas = max_personas;
    }

    public String getSala() {
        return Sala;
    }

    public void setSal(String lugar) {
        this.Sala = lugar;
    }
        public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
   
}

