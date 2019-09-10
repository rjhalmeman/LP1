
package Main;

/**
 *
 * @author radames
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entrada entradaDeDados = new Entrada();
        Saida saida = new Saida();
        int tam = entradaDeDados.tamanhoDaMatriz();
        Processamento processamento = new Processamento(tam);
        saida.imprimirMatrizInt(processamento.getMat());  
    }
    
}
