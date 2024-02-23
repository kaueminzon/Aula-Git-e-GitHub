/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.projetopoo.projetopoo;

/**
 *
 * @author Admin
 */
public class ProjetoPOO {

    public static void main(String[] args) {
        /*Abstração Abaixo*/
        livraria livro1 = new livraria ("Culpa Das Estrelas"); /*Criação da Instancia*/
        livraria livro2 = new livraria ("Vidas Secas");
        livraria livro3 = new livraria ("Senhor dos Anéis");
        livraria livro4 = new livraria ("Harry Potter");
        livraria livro5 = new livraria ("Jogos Vorazes");
        
        livro1.valor = "50$"; /*Atributo da Instancia*/
        livro2.valor = "30$";
        livro3.valor = "160$";
        livro4.valor = "300$";
        livro5.valor = "30$";
        
        System.out.println("Nome do livro 1 = "+livro1.livro);
        System.out.println("Nome do livro 2 = "+livro2.livro);
        System.out.println("Nome do livro 3 = "+livro3.livro);
        System.out.println("Nome do livro 4 = "+livro4.livro);
        System.out.println("Nome do livro 5 = "+livro5.livro);
        
        System.out.println("Valor do livro 1 ="+livro1.valor);
        System.out.println("Valor do livro 2 ="+livro2.valor);
        System.out.println("Valor do livro 3 ="+livro3.valor);
        System.out.println("Valor do livro 4 ="+livro4.valor);
        System.out.println("Valor do livro 5 ="+livro5.valor);
        
        System.out.println("Local da Biblioteca = "+livro1.local); 
        System.out.println("Local da Biblioteca = "+livro2.local); 
        System.out.println("Local da Biblioteca = "+livro3.local); 
        System.out.println("Local da Biblioteca = "+livro4.local); 
        System.out.println("Local da Biblioteca = "+livro5.local); 
    }
}
