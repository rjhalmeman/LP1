package Main;

import java.util.ArrayList;
import java.util.List;
import tools.ManipulaArquivo;

/**
 *
 * @author radames
 */
public class TestesPersistencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
//        ls.add("João");
//        ls.add("Maria");
//        ls.add("Pedro");
//        ls.add("Ana");
        
        ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
        
       // manipulaArquivo.salvarArquivo("/home/radames/Documentos/dados.txt", ls);
        ls = manipulaArquivo.abrirArquivo("/home/radames/Documentos/dados.txt");
        
        for (int i = 0; i < ls.size(); i++) {
            System.out.println(ls.get(i));
        }
        
        
    }
    
}
