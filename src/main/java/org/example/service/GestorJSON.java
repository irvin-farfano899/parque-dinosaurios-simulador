package org.example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.Dinosaurio;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class GestorJSON {
    private final ObjectMapper mapper = new ObjectMapper();
    private final String RUTA_ARCHIVO = "datos_parque.json";

    public void guardarDinosaurios(List<Dinosaurio> dinosaurios) {
        try {
            // Esto convierte tu lista de objetos a un formato legible en un archivo JSON
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(RUTA_ARCHIVO), dinosaurios);
            System.out.println("¡Datos guardados exitosamente en " + RUTA_ARCHIVO + "!");
        } catch (IOException e) {
            System.err.println("Error al guardar en JSON: " + e.getMessage());
        }
    }
}