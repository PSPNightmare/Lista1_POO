/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA_01;

/**
 *
 * @author berna
 */
public class ContaBancaria {
    
    String numeroConta, titular;
    double saldo;
    
    
    public void depositar (double valor){
        saldo += valor;
        System.out.println("Valor sacado com sucesso");
    }
    
    public void sacar (double valor){
        if (valor <= saldo){
            saldo -=valor;
            System.out.println("Valor sacado com sucesso");
        }else {
            System.out.println("Valor insuficiente");
        } 
        
    }
    
    
}
