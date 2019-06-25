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
        //entrada de dados
        int max = 5;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < max; i++) {
            int valor = entrada.lerNumeroInteiro("Digite um número");
            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
        }
        //saida de dados   
        Saida saida = new Saida();
        saida.imprimirNumeroInteiro(maior, "Maior");
        saida.imprimirNumeroInteiro(menor, "Menor");
    }

}
