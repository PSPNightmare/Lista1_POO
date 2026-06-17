/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA_01;

/**
 *
 * @author berna
 */
class Funcionario {

    String nome;
    double salario;
    String departamento;

    public void aumentarSalario(double percentual) {
        salario += salario * percentual / 100;
    }
}

