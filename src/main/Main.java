/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author lorena
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria Cuenta= new CuentaBancaria ("Juan Pérez",1000);
        Cuenta.mostrarTitular();
        
        Cuenta.modificarTitular("Elias Bahamondes");
        Cuenta.agregarSaldo(5000);
        Cuenta.retiroSaldo(3000);
        Cuenta.retiroSaldo(10000);
        Cuenta.mostrarSaldo();
    }
    
}
