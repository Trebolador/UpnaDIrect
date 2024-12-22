/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect;

import java.time.LocalDate;
/**
 *
 * @author alumno
 */
public class Cliente {
    private int anhoNacimiento;
    private int salario;
    
    public Cliente(int a, int s){
        anhoNacimiento = a;
        salario = s;
    }
    
    public boolean esJoven(){
        return (LocalDate.now().getYear() - anhoNacimiento) <= 20;
    }
    
    public boolean esMayor() {
        return (LocalDate.now().getYear() - anhoNacimiento) >= 60;
    }
    
    public int salario(){
        return salario;
    }
    
}
