/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect;

/**
 *
 * @author alumno
 */
public class Presentador {
    private VistaConsola vista;
    private Poliza poliza;
    
    public Presentador(VistaConsola v){
        vista = v;
    }
    
    public void crearPoliza(){
        Cliente cliente = vista.introducirCliente();
        Bien bien = vista.introducirBien();
        
        poliza  = vista.instanciarPoliza(bien, cliente);
        
    }
    
    public void mostrarPoliza(){
        vista.imprimirPoliza(poliza);
    }
}
