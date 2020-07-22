package Main;

import java.util.ArrayList;
import java.util.List;
import tools.ManipulaArquivo;

/**
 *
 * @author radames
 */
public class UI {

    ControleDeLista controleDeLista = new ControleDeLista();
    int opcao = 0;

    public void telaAdicionar() {
        //chave primária
        Entrada entrada = new Entrada();
        int idLivro = entrada.lerNumeroInteiro("Id do Livro");
        Livro livro = controleDeLista.buscar(idLivro);
        if (livro == null) {//não achou na lista, então pode incluir
            livro = new Livro();
            livro.setIdLivro(idLivro);
            entrada = new Entrada();//para corrigir erro ao ler o nome.      
            livro.setNomeLivro(entrada.lerString("Nome"));
            livro.setAutorLivro(entrada.lerString("Autor"));
            controleDeLista.adicionar(livro);
        } else {
            System.out.println("Já está cadastrado");
        }
    }

    public void telaBuscar() {
        //chave primária
        Entrada entrada = new Entrada();
        int idLivro = entrada.lerNumeroInteiro("Id do Livro");
        Livro livro = controleDeLista.buscar(idLivro);
        if (livro == null) {//não achou na lista
            System.out.println("Não está cadastrado");
        } else {
            System.out.println("\n Encontrou ");
            Saida saida = new Saida();
            saida.rotuloString("Id", String.valueOf(livro.getIdLivro()));
            saida.rotuloString("Nome", livro.getNomeLivro());
            saida.rotuloString("Autor", livro.getAutorLivro());
            System.out.println("\n");
        }
    }

    public void telaAlterar() {
        //chave primária
        Entrada entrada = new Entrada();
        int idLivro = entrada.lerNumeroInteiro("Id do Livro");
        Livro livro = controleDeLista.buscar(idLivro);
        if (livro == null) {//não achou na lista
            System.out.println("Não está cadastrado");
        } else {//se achou
            System.out.println("\n Encontrou - pode alterar ");
            Saida saida = new Saida();
            saida.rotuloString("Id", String.valueOf(livro.getIdLivro()));
            saida.rotuloString("Nome", livro.getNomeLivro());
            saida.rotuloString("Autor", livro.getAutorLivro());
            System.out.println("\n");

            Livro atual = livro;
            entrada = new Entrada();
            saida.rotuloString("Id do livro", String.valueOf(livro.getIdLivro()));
            livro.setNomeLivro(entrada.lerString("Novo nome do livro"));
            livro.setAutorLivro(entrada.lerString("Novo nome do autor"));
            controleDeLista.atualizar(atual, livro);
            System.out.println("\n");
        }
    }

    public void telaExcluir() {
        //chave primária
        Entrada entrada = new Entrada();
        int idLivro = entrada.lerNumeroInteiro("Id do Livro");
        Livro livro = controleDeLista.buscar(idLivro);
        if (livro == null) {//não achou na lista
            System.out.println("Não está cadastrado");
        } else {//se achou
            System.out.println("\n Encontrou - pode excluir ");
            Saida saida = new Saida();
            saida.rotuloString("Id", String.valueOf(livro.getIdLivro()));
            saida.rotuloString("Nome", livro.getNomeLivro());
            saida.rotuloString("Autor", livro.getAutorLivro());
            System.out.println("\n");

            if (entrada.lerConfirmacao("Excluir o livro?")) {
                controleDeLista.excluir(livro);
            }
            System.out.println("\n");
        }
    }

    public void telaListar() {
        List<Livro> ll = controleDeLista.listar();
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i).toString());
        }
    }

    public UI() {
        Entrada entrada = new Entrada();
        ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
        List<String> ls = manipulaArquivo.abrirArquivo("Livros.csv");
        for (String ll : ls) {
            String[] aux = ll.split(";");//1;Iracema;José de Alencar
            Livro livro = new Livro();
            livro.setIdLivro(Integer.valueOf(aux[0]));
            livro.setNomeLivro(aux[1]);
            livro.setAutorLivro(aux[2]);
            controleDeLista.adicionar(livro);
        }

        while (opcao != 9) {
            System.out.println("1 - Adicionar");
            System.out.println("2 - Buscar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Listar");
            System.out.println("9 - Sair");

            opcao = entrada.lerNumeroInteiro("Escolha uma opção");

            switch (opcao) {
                case 1:
                    telaAdicionar();
                    break;
                case 2:
                    telaBuscar();
                    break;
                case 3:
                    telaAlterar();
                    break;
                case 4:
                    telaExcluir();
                    break;
                case 5:
                    telaListar();
                    break;
                case 9:   //sair 
                    //persistir
                    ls = new ArrayList<>();
                    List<Livro> lv = controleDeLista.listar();
                    for (int i = 0; i < lv.size(); i++) {
                        ls.add(lv.get(i).toString());
                    }
                    manipulaArquivo = new ManipulaArquivo();
                    manipulaArquivo.salvarArquivo("Livros.csv", ls);
                    System.out.println("Bye bye");
                    break;
                default:
                    System.out.println("Opção inválida");

            }
        }
    }
}
