/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA_01;

/**
 *
 * @author berna
 */
public class ATV4 {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "João";
        funcionario.salario = 3000;
        funcionario.departamento = "TI";

        funcionario.aumentarSalario(10);

        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Salário: R$ " + funcionario.salario);
    }
}

