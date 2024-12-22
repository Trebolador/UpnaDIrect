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
public class Bien {
    private int valor;
    private String tipo;
    
    public Bien(int v, String t){
        valor = v;
        tipo = t;
    }
    
    public int valor(){
        return valor;
    }
    
    public String tipo(){
        return tipo;
    }
}
