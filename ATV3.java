/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA_01;

/**
 *
 * @author berna
 */
public class ATV3 {
    
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.marca = "Toyota";
        carro.modelo = "Corolla";
        carro.ano = 2022;

        carro.ligar();
        System.out.println("Carro ligado? " + carro.ligado);

        carro.desligar();
        System.out.println("Carro ligado? " + carro.ligado);
    }
}

