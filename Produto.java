/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA_01;

/**
 *
 * @author berna
 */
class Produto {

    String nome;
    double preco;
    int quantidadeEmEstoque;

    public void vender(int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }

    public void reporEstoque(int quantidade) {
        quantidadeEmEstoque += quantidade;
    }

}
