package org.example;

import org.example.model.Dinosaurio;
import org.example.service.ParqueService;

public class Main {
    public static void main(String[] args) {
        ParqueService parque = new ParqueService();

        // 1. Registro
        Dinosaurio dino1 = new Dinosaurio(1L, "Rexy", "Tiranosaurio Rex", true);
        Dinosaurio dino2 = new Dinosaurio(2L, "Cera", "Triceratops", false);

        parque.registrarDinosaurio(dino1);
        parque.registrarDinosaurio(dino2);
        System.out.println("Dinosaurios registrados correctamente.");

        // 2. Listado
        System.out.println("\n--- Lista de Criaturas ---");
        for (Dinosaurio d : parque.listarDinosaurios()) {
            System.out.println("ID: " + d.getId() + " | Nombre: " + d.getNombre() + " | Especie: " + d.getEspecie());
        }

        // 3. Modificación
        System.out.println("\n--- Modificando dinosaurio ---");
        boolean modificado = parque.modificarDinosaurio(1L, "Rex Pro", "T-Rex Modificado", true);
        if (modificado) {
            System.out.println("Dinosaurio modificado con éxito.");
        }
    }
}