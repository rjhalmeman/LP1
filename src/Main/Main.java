
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
        Entrada entrada = new Entrada();
        double a = entrada.lerNumeroDouble("Digite o primeiro número");
        double b = entrada.lerNumeroDouble("Digite o segundo número");
        
        
        Processamento processamento = new Processamento();
        double s = processamento.somarDoisNumeros(a, b);
        
        
        Saida saida = new Saida();
        saida.imprimirNumeroDouble("A soma é", s);
    }
    
}
