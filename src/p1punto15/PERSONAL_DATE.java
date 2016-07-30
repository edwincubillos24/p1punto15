/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1punto15;

import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class PERSONAL_DATE {
     String nombre, cedula, nacimiento, direccion, telefono;
     int edad;
     
    
    public void loading_data(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Digite el nombre: ");
        nombre = lector.next();        
    }
    
    public void data_show(){
        System.out.println("El nombre es: "+nombre);
    }  
    

 }


