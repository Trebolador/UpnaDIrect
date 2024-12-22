/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class AdaslesTest {
    
    @Test
    public void vehiculoEsJoven() {
        Bien bien = new Bien(20000, "vehiculo");
        Cliente cliente = new Cliente(2005,2200);
        Aseguradora adasles = new Adasles(bien,cliente);
        assertTrue(adasles.importe() == 1200);
    }
    
    @Test
    public void viviendaEsMayor() {
        Bien bien = new Bien(500000, "vivienda");
        Cliente cliente = new Cliente(1902, 2);
        Aseguradora adasles = new Adasles(bien, cliente);
        assertTrue(adasles.importe() == 10000);
    }
    
}
