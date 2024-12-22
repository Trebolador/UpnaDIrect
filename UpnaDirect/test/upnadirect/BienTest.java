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
public class BienTest {
    
    @Test
    public void testValor() {
        Bien bien = new Bien(20000, "");
        assertTrue(bien.valor() == 20000);
    }
    
    @Test
    public void testTipo() {
        Bien bien = new Bien(0, "vivienda");
        assertTrue(bien.tipo().equals("vivienda"));
    }
    
}
