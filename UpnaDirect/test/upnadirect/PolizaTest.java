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
public class PolizaTest {
    
    @Test
    public void vehiculoEsJoven() {
        Bien bien = new Bien(30000, "vehiculo");
        Cliente cliente = new Cliente(2005, 15000);
        Poliza poliza = new Poliza(cliente,bien);
        assertTrue(poliza.mostrarPoliza().equals("Linea Indirecta | 900 | 9"));
    }
    
    
    
}
