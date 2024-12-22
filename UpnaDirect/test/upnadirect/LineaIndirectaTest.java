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
public class LineaIndirectaTest {
    
    @Test
    public void vehiculoBarato() {
        Bien bien = new Bien(500, "vehiculo");
        Cliente cliente = new Cliente(1700, 999999);
        Aseguradora lineaIndirecta = new LineaIndirecta(bien, cliente);
        assertTrue(lineaIndirecta.importe() == 20);
    }
    
    @Test
    public void vehiculoCaroClienteMayor() {
        Bien bien = new Bien(50000, "vehiculo");
        Cliente cliente = new Cliente(1700, 5);
        Aseguradora lineaIndirecta = new LineaIndirecta(bien, cliente);
        assertTrue(lineaIndirecta.importe() == 3000);
    }
}
