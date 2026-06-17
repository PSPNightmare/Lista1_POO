/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA_01;

/**
 *
 * @author berna
 */
public class ATV7 {

    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "Notebook";
        produto.preco = 3500;
        produto.quantidadeEmEstoque = 10;

        produto.vender(3);
        System.out.println("Estoque após venda: " + produto.quantidadeEmEstoque);

        produto.reporEstoque(5);
        System.out.println("Estoque após reposição: " + produto.quantidadeEmEstoque);
    }
}
