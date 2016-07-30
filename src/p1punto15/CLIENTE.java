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
public class CLIENTE extends PERSONAL_DATE{
        private double saldo;
        private Scanner lector;
        
        public void Actualizar_Datos(){
            lector = new Scanner(System.in);
            System.out.println("Digite el nuevo nombre: ");
            nombre = lector.next();                    
        }
        
        public void Consignacion(){            
            System.out.println("Digite el valor a consignar ");
            saldo = saldo + lector.nextDouble();
        }      
    }
    

