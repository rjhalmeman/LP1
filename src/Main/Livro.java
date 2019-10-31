/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author a2021200
 */
public class Livro {

    private String id;
    private String nome;
    private String autor;
    private int maxPaginas;
    private String editoras;

    public Livro() {
    }

    public Livro(String id, String nome, String autor, int maxPaginas, String editoras) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.maxPaginas = maxPaginas;
        this.editoras = editoras;
    }

    public String getEditoras() {
        return editoras;
    }

    public void setEditoras(String editoras) {
        this.editoras = editoras;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getMaxPaginas() {
        return maxPaginas;
    }

    public void setMaxPaginas(int maxPaginas) {
        this.maxPaginas = maxPaginas;
    }

    @Override
    public String toString() {
        return "X{" + "id=" + id + ", nome=" + nome + ", autor=" + autor + ", maxPaginas=" + maxPaginas + ", editoras=" + editoras + '}';
    }

}
