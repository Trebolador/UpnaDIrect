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
public class LineaIndirecta implements Aseguradora{
    private int importe;
    
    public LineaIndirecta(Bien b, Cliente c){
        if(("vehiculo".equals(b.tipo()) && b.valor() < 20000) || ("vivienda".equals(b.tipo()) && b.valor() < 150000)){
            importe = (int)(b.valor() * 0.04);
        }
        else if("vehiculo".equals(b.tipo()) && b.valor() >= 20000 && c.esMayor()){
            importe = (int)(b.valor() * 0.06);
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
        return "Linea Indirecta";
    }
}
