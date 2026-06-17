/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA_01;

/**
 *
 * @author berna
 */
public class ATV2 {
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria();
        
        conta.numeroConta = "12345";
        conta.saldo = 5.00;
        conta.titular = "Bernardo";
        
         System.out.println("Titular: " + conta.titular);
        System.out.println("Conta: " + conta.numeroConta);
        System.out.println("Saldo: R$ " + conta.saldo);
        
        conta.sacar(10.00);
        conta.depositar(100);
        
    }
}
