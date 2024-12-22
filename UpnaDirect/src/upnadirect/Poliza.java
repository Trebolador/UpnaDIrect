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
public class Poliza {
    private Aseguradora aseguradoraFinal;
    
    public Poliza(Cliente cliente, Bien bien){
        int importeMin = 0;
        
        Aseguradora[] aseguradoras = new Aseguradora[3];
        
        aseguradoras[0] = new Mafro(bien,cliente);
        aseguradoras[1] = new LineaIndirecta(bien,cliente);
        aseguradoras[2] = new Adasles(bien,cliente);
        
        for(int i = 0; i < 3; i++){
            if(aseguradoras[i].importe() < importeMin || importeMin == 0){
                importeMin = aseguradoras[i].importe();
                aseguradoraFinal = aseguradoras[i];
            }
            else if(aseguradoras[i].importe() == importeMin){
                if(comision(aseguradoras[i]) > comision(aseguradoraFinal)){
                    importeMin = aseguradoras[i].importe();
                    aseguradoraFinal = aseguradoras[i];
                }
            }
        }
    }
    
    private int comision(Aseguradora a){
        if(a.importe() < 1000){
            return (int)(a.importe() * 0.01);
        } 
        if("Mafro".equals(a.nombre())){
            return (int)(a.importe() * 0.03);
        }
        if("Linea Indirecta".equals(a.nombre())){
            return (int)(a.importe() * 0.04);
        }
        return (int)(a.importe() * 0.05);
    }
    
    public String mostrarPoliza(){
        return aseguradoraFinal.nombre() + " | " + aseguradoraFinal.importe() + " | " + comision(aseguradoraFinal);
    }
}
