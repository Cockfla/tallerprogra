/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author lorena
 */
public class CuentaBancaria {
    private String Titular;
    private double Saldo;
    
    public CuentaBancaria(String Titular, double SaldoInicial){
        this.Titular = Titular;
        this.Saldo=SaldoInicial;
    }
    public void modificarTitular(String nuevoTitular){
        Titular=nuevoTitular;
    }
    public void mostrarTitular(){
       System.out.println("Titular de la cuenta: "+Titular);
    }
    public void agregarSaldo(double Cantidad){
        Saldo+=Cantidad;
    }
    public void retiroSaldo(double Cantidad){
        if (Cantidad>Saldo){
            System.out.println("Saldo Insuficiente. Porfavor cargue más dinero a su cuenta.");
        }else{
            Saldo -=Cantidad;
        }
    }
    public void mostrarSaldo(){
        System.out.println("Su saldo es de: $"+Saldo);
    }
}
