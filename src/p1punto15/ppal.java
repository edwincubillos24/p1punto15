/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1punto15;

/**
 *
 * @author Edwin
 */
public class ppal {
    public static void main(String[] args) {
        CLIENTE cliente1 = new CLIENTE();
        cliente1.loading_data();
        cliente1.data_show();
        cliente1.Actualizar_Datos();
        cliente1.data_show();
    }
}
