package org.example.service;

import org.example.model.Dinosaurio;
import java.util.ArrayList;
import java.util.List;

public class ParqueService {
    private List<Dinosaurio> dinosaurios = new ArrayList<>();

    // 1. Registrar
    public void registrarDinosaurio(Dinosaurio dino) {
        dinosaurios.add(dino);
        System.out.println("🦖 " + dino.getNombre() + " (" + dino.getEspecie() + ") ha sido asignado a su hábitat.");
    }

    // 2. Listar
    public List<Dinosaurio> listarDinosaurios() {
        return dinosaurios;
    }

    // 3. Modificar (¡Requerido por la rúbrica!)
    public boolean modificarDinosaurio(Long id, String nuevoNombre, String nuevaEspecie, boolean nuevoEsCarnivoro) {
        for (Dinosaurio dino : dinosaurios) {
            if (dino.getId().equals(id)) {
                dino.setNombre(nuevoNombre);
                dino.setEspecie(nuevaEspecie);
                dino.setEsCarnivoro(nuevoEsCarnivoro);
                return true; // Modificación exitosa
            }
        }
        return false; // No se encontró
    }

    // 4. Eliminar (¡Requerido por la rúbrica!)
    public boolean eliminarDinosaurio(Long id) {
        return dinosaurios.removeIf(dino -> dino.getId().equals(id));
    }

    // 5. Simular Día
    public void simularDia() {
        System.out.println("\n=======================================");
        System.out.println("🌅 INICIANDO RECORRIDO DIARIO DEL PARQUE");
        System.out.println("=======================================");

        if (dinosaurios.isEmpty()) {
            System.out.println("⚠️ El parque está vacío. No hay dinosaurios que simular.");
            return;
        }

        for (Dinosaurio dino : dinosaurios) {
            if (dino.isEsCarnivoro()) {
                System.out.println("🍖 " + dino.getNombre() + " [" + dino.getEspecie() + "] está rugiendo y buscando carne.");
            } else {
                System.out.println("🌿 " + dino.getNombre() + " [" + dino.getEspecie() + "] está pastando tranquilamente en el prado.");
            }
        }
        System.out.println("=======================================\n");
    }
}