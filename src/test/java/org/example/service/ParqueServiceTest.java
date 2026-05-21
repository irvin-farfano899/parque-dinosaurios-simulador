package org.example.service;

import org.example.model.Dinosaurio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParqueServiceTest {

    @Test
    public void testRegistrarDinosaurio() {
        ParqueService service = new ParqueService();
        Dinosaurio d = new Dinosaurio(1L, "Rex", "T-Rex", true);
        service.registrarDinosaurio(d);
        assertEquals(1, service.listarDinosaurios().size());
    }

    @Test
    public void testEliminarDinosaurio() {
        ParqueService service = new ParqueService();
        Dinosaurio d = new Dinosaurio(2L, "Cera", "Triceratops", false);
        service.registrarDinosaurio(d);
        boolean res = service.eliminarDinosaurio(2L);
        assertTrue(res);
    }
}