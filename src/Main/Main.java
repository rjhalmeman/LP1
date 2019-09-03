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

        int tamanho = entrada.lerNumeroInteiro("Qual o tamanho do vetor");

        Processamento processamento = new Processamento(5);
        Saida saida = new Saida();

        for (int i = 0; i < tamanho; i++) {
            int x = entrada.lerNumeroInteiro("Digite v[" + i + "]");
            processamento.adicionarElemento(x);
        }

        for (int i = tamanho - 1; i >= 0; i--) {
            int y = processamento.getElemento(i);
            saida.imprimirNumeroDouble("v[" + i + "]", y);
        }

    }

}
