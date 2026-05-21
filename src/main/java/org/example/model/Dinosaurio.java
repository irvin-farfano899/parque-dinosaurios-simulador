package org.example.model;

public class Dinosaurio {
    private Long id;
    private String nombre;
    private String especie;
    private boolean esCarnivoro;

    // ESTE ES EL CONSTRUCTOR QUE FALTA
    public Dinosaurio(Long id, String nombre, String especie, boolean esCarnivoro) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.esCarnivoro = esCarnivoro;
    }

    // Asegúrate de tener también los Getters y Setters
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }
    public boolean isEsCarnivoro() { return esCarnivoro; }
    public void setEsCarnivoro(boolean esCarnivoro) { this.esCarnivoro = esCarnivoro; }
}