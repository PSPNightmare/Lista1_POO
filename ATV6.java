/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA_01;

/**
 *
 * @author berna
 */
public class ATV6 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = "Maria";
        aluno.matricula = 1234;
        aluno.notas = new double[]{8.0, 7.5, 9.0};

        System.out.println("Média: " + aluno.calcularMedia());
    }
}

