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
public class ClienteTest {
    

    /**
     * Test of esJoven method, of class Cliente.
     */
    @Test
    public void clienteJovenEsJoven() {
        Cliente cliente = new Cliente(2005,0);
        assertTrue(cliente.esJoven());
    }

    /**
     * Test of esMayor method, of class Cliente.
     */
    @Test
    public void clienteJovenNoEsMayor() {
        Cliente cliente = new Cliente(2005,0);
        assertFalse(cliente.esMayor());
    }

    /**
     * Test of salario method, of class Cliente.
     */
    @Test
    public void clienteMayorEsMayor() {
        Cliente cliente = new Cliente(1900,0);
        assertTrue(cliente.esMayor());
    }
    
    @Test
    public void clienteMayorNoEsJoven() {
        Cliente cliente = new Cliente(1900,0);
        assertFalse(cliente.esJoven());
    }
    
    @Test
    public void salarioCliente() {
        Cliente cliente = new Cliente(0,2000);
        assertTrue(cliente.salario() == 2000);
    }
    
    
}
