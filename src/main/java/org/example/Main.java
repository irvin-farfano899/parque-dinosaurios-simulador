package org.example;

import org.example.model.Dinosaurio;
import org.example.service.ParqueService;

public class Main {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("🦖 SIMULADOR PARQUE DE DINOSAURIOS INICIADO 🦖");
        System.out.println("==============================================");

        // Instanciamos el servicio
        ParqueService parque = new ParqueService();

        // 1. PRUEBA DE REGISTRO
        System.out.println("\n--- [PASO 1] Registrando Dinosaurios ---");
        Dinosaurio dino1 = new Dinosaurio(1L, "Rexy", "Tiranosaurio Rex", true);
        Dinosaurio dino2 = new Dinosaurio(2L, "Cera", "Triceratops", false);

        parque.registrarDinosaurio(dino1);
        parque.registrarDinosaurio(dino2);

        // 2. PRUEBA DE LECTURA (LISTAR)
        System.out.println("\n--- [PASO 2] Lista Inicial de Criaturas ---");
        for (Dinosaurio d : parque.listarDinosaurios()) {
            System.out.println("ID: " + d.getId() + " | " + d.getNombre() + " (" + d.getEspecie() + ")");
        }

        // 3. PRUEBA DE MODIFICACIÓN (Actualizar los datos de Rexy)
        System.out.println("\n--- [PASO 3] Modificando Dinosaurio con ID 1 ---");
        boolean modificado = parque.modificarDinosaurio(1L, "Rey T-Rex", "Tiranosaurio Imponente", true);
        if (modificado) {
            System.out.println("✅ ¡Dinosaurio modificado con éxito!");
        }

        // Listamos de nuevo para comprobar que cambió el nombre a "Rey T-Rex"
        System.out.println("\n--- Lista Actualizada tras la Modificación ---");
        for (Dinosaurio d : parque.listarDinosaurios()) {
            System.out.println("ID: " + d.getId() + " | " + d.getNombre() + " (" + d.getEspecie() + ")");
        }

        // 4. PRUEBA DE ELIMINACIÓN (Sacar a Cera del parque)
        System.out.println("\n--- [PASO 4] Eliminando Dinosaurio con ID 2 (Cera) ---");
        boolean eliminado = parque.eliminarDinosaurio(2L);
        if (eliminado) {
            System.out.println("🗑️ ¡Dinosaurio removido del parque con éxito!");
        }

        // 5. SIMULACIÓN DIAL FINAL (Solo debería quedar Rey T-Rex)
        parque.simularDia();
    }
}