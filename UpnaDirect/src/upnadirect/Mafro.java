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
public class Mafro implements Aseguradora{
    private int importe;
    
    public Mafro(Bien b, Cliente c){
        if("vehiculo".equals(b.tipo()) && c.esJoven()){
            importe = (int)(b.valor() * 0.05);
        }
        else if("vivienda".equals(b.tipo()) && b.valor() >= 200000 && c.salario() < 20000){
            importe = (int)(b.valor() * 0.02);
        }
        else{
            importe = (int)(b.valor() * 0.03);
        }
    }
    
    @Override
    public int importe(){
        return importe;
    }
    
    @Override
    public String nombre(){
        return "Mafro";
    }
}
