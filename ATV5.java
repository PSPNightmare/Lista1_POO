/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA_01;

/**
 *
 * @author berna
 */
public class ATV5 {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.titulo = "Dom Casmurro";
        livro.autor = "Machado de Assis";
        livro.anoPublicacao = 1899;
        livro.disponivel = true;

        livro.emprestar();
        System.out.println("Disponível? " + livro.disponivel);

        livro.devolver();
        System.out.println("Disponível? " + livro.disponivel);
    }
}
