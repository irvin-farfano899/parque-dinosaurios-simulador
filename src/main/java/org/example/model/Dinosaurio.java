package org.example.model;

public class Dinosaurio {
    private Long id;
    private String nombre;
    private String especie;
    private boolean esCarnivoro;

    // Constructor vacío (Obligatorio para que las bases de datos trabajen bien)
    public Dinosaurio() {
    }

    // Constructor completo para crear dinosaurios rápido
    public Dinosaurio(Long id, String nombre, String especie, boolean esCarnivoro) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.esCarnivoro = esCarnivoro;
    }

    // Getters y Setters (Para acceder a los datos privados)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public boolean isEsCarnivoro() { return esCarnivoro; }
    public void setEsCarnivoro(boolean esCarnivoro) { this.esCarnivoro = esCarnivoro; }}

