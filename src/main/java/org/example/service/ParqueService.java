package org.example.service;

import org.example.model.Dinosaurio;
import java.util.ArrayList;
import java.util.List;

public class ParqueService {
    private List<Dinosaurio> listaDinosaurios = new ArrayList<>();

    public void registrarDinosaurio(Dinosaurio d) {
        listaDinosaurios.add(d);
    }

    public List<Dinosaurio> listarDinosaurios() {
        return listaDinosaurios;
    }

    public boolean modificarDinosaurio(Long id, String nuevoNombre, String nuevaEspecie, boolean esCarnivoro) {
        for (Dinosaurio d : listaDinosaurios) {
            if (d.getId().equals(id)) {
                d.setNombre(nuevoNombre);
                d.setEspecie(nuevaEspecie);
                d.setEsCarnivoro(esCarnivoro);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarDinosaurio(Long id) {
        return listaDinosaurios.removeIf(d -> d.getId().equals(id));
    }
}