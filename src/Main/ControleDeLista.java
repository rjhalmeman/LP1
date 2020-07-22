package Main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author radames
 */
public class ControleDeLista {

    private List<Livro> listaDeLivros = new ArrayList<>();

    public void adicionar(Livro livro) {
        listaDeLivros.add(livro);
    }

    public Livro buscar(int idLivro) {
        for (int i = 0; i < listaDeLivros.size(); i++) {
            if (idLivro == listaDeLivros.get(i).getIdLivro()) {
                return listaDeLivros.get(i);
            }
        }
        return null;
    }

    public void atualizar(Livro atual, Livro modificado) {
        listaDeLivros.set(listaDeLivros.indexOf(atual), modificado);
    }

    public void excluir(Livro livro) {
        listaDeLivros.remove(livro);
    }

    public List<Livro> listar() {
        return listaDeLivros;
    }

}
