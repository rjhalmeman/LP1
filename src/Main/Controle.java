package Main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a2021200
 */
public class Controle {

    List<Livro> lista = new ArrayList<>();

    public void inserir(Livro livro) {
        lista.add(livro);
    }

    public List<Livro> listar() {
        return lista;
    }

}
