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
public class Adasles implements Aseguradora{
    private int importe;
    
    public Adasles(Bien b, Cliente c){
        if("vehiculo".equals(b.tipo()) && (c.esJoven() || c.esMayor())){
            importe = (int)(b.valor() * 0.06);
        }
        else{
            importe = (int)(b.valor() * 0.02);
        }
    }
    
    @Override
    public int importe(){
        return importe;
    }
    
    @Override
    public String nombre(){
        return "Adasles";
    }
    
}
