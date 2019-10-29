package Main;

import java.util.ArrayList;
import java.util.List;
import tools.ManipulaArquivo;

/**
 *
 * @author radames
 */
public class Controle {
     private List<Aluno> lista = new ArrayList<>();
    
    

    public Controle() { //esse construtor é usado para adicionar alguns dados na lista e 

    }

    public void limparLista() {
        lista.clear();//zera a lista
    }

    public void adicionar(Aluno aluno) {
        lista.add(aluno);
    }

    public List<Aluno> listar() {
        return lista;
    }

    public Aluno buscar(String ra) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getRA().equals(ra)) {
                return lista.get(i);
            }
        }
        return null;

    }

    public void alterar(Aluno aluno, Aluno alunoAntigo) {
        lista.set(lista.indexOf(alunoAntigo), aluno);

    }

    public void excluir(Aluno aluno) {
        lista.remove(aluno);
    }

    public void gravarLista(String caminho) {
        ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
        List<String> listaDeString = new ArrayList<>();
        for (Aluno aluno : lista) {
            listaDeString.add(aluno.toString());
        }
        manipulaArquivo.salvarArquivo(caminho, listaDeString);
    }

    void carregarDados(String caminho) {
        ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
        if (!manipulaArquivo.existeOArquivo(caminho)) {
            manipulaArquivo.criarArquivoVazio(caminho);
        }

        List<String> listaDeString = manipulaArquivo.abrirArquivo(caminho);
        //converter de CSV para Aluno
        Aluno aluno;
        for (String string : listaDeString) {
            String aux[] = string.split(";");
            aluno = new Aluno(aux[0], aux[1], Double.valueOf(aux[2]), aux[3],aux[4]);
            lista.add(aluno);
        }
    }
}
