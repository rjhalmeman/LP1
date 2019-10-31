/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.List;

/**
 *
 * @author a2021200
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controle controle = new Controle();
        Livro livro = new Livro();
        livro.setId("1");
        livro.setNome("A culpa das estrelas");
        livro.setEditoras("intri");
        livro.setMaxPaginas(200);
        livro.setAutor("Antonio Bandeira");

        controle.inserir(livro);

        livro = new Livro("2", "SE eu ficar",
                "X", 300, "Gayle Forman");
        controle.inserir(livro);
        List<Livro> lista = controle.listar();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

    }

}
