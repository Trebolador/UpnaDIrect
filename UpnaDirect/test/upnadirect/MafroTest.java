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
public class MafroTest {
    
    @Test
    public void vehiculoEsJoven() {
        Bien bien = new Bien(20000, "vehiculo");
        Cliente cliente = new Cliente(2005, 2200);
        Aseguradora mafro = new Mafro(bien, cliente);
        assertTrue(mafro.importe() == 1000);
    }
    
    @Test
    public void viviendaCaraYClienteCobraPoco() {
        Bien bien = new Bien(8000000, "vivienda");
        Cliente cliente = new Cliente(1969, 5);
        Aseguradora mafro = new Mafro(bien, cliente);
        assertTrue(mafro.importe() == 160000);
    }
    
}
