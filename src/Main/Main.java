
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
        int valor1 = entradaDeDados.getValorInteiro("Valor 1");
        int valor2 = entradaDeDados.getValorInteiro("Valor 2");
        int valor3 = entradaDeDados.getValorInteiro("Valor 3");
        
        Processamento processamento = new Processamento();
        double media = processamento.getMedia(valor1, valor2, valor3);
        
        Saida saida = new Saida();
        saida.imprimirNumeroDouble("Média", media);
    }
    
}
