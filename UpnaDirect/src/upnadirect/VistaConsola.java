/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect;

import java.util.Scanner;
import java.time.LocalDate;
/**
 *
 * @author alumno
 */
public class VistaConsola {
    
    public Cliente introducirCliente(){
        Cliente cliente;
        int anhoNacimiento;
        int salario;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Introduce su anho de nacimiento: ");
        anhoNacimiento = scan.nextInt();
        
        while(anhoNacimiento < -1 && anhoNacimiento > LocalDate.now().getYear()){
            System.out.print("Introduzca un anho valido (positivo y menor al anho actual): ");
            anhoNacimiento = scan.nextInt();
        }
        
        System.out.print("Introduce su salario: ");
        salario = scan.nextInt();
        
        while(salario < 0){
            System.out.print("Introduzca un salario valido (entero positivo): ");
            anhoNacimiento = scan.nextInt();
        }
        
        cliente = new Cliente(anhoNacimiento,salario);
        
        scan.close();
        
        return cliente;
    }
    
    public Bien introducirBien(){
        Bien bien;
        String tipo;
        int valor;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Va a asegurar un vehiculo (1) o una vivienda (2)?: ");
        tipo = scan.nextLine();
        
        while(!"1".equals(tipo) && !"2".equals(tipo)){
            System.out.print("Introduzca un valor valido (1/2): ");
            tipo = scan.nextLine();
        }
        
        if("1".equals(tipo)){
            System.out.print("Introduzca el valor del vehiculo (entre 0 y 50000): ");
            valor = scan.nextInt();
            while(0 > valor || valor > 50000 ){
                System.out.print("Introduzca un valor valido (entre 0 y 50000): ");
                valor = scan.nextInt();
            }
            bien = new Bien(valor,"vehiculo");
        }
        else{
            System.out.print("Introduzca el valor de la vivienda (mayor que 50000): ");
            valor = scan.nextInt();
            while(valor < 50000 ){
                System.out.print("Introduzca un valor valido (mayor que 50000): ");
                valor = scan.nextInt();
            }
            bien = new Bien(valor,"vivienda");
        }
        
        scan.close();
        
        return bien;
    }
    
    public Poliza instanciarPoliza(Bien bien,Cliente cliente){
        return new Poliza(cliente,bien);
    }
    
    public void imprimirPoliza(Poliza poliza){
        System.out.println(poliza.mostrarPoliza());
    }
}
