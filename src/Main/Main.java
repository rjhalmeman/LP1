package Main;

/**
 * @author Radames J Halmeman - rjhalmeman@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        double a = entrada.lerNumeroDouble("Digite um valor para A");
        double b = entrada.lerNumeroDouble("Digite um valor para B");

        Processamento processamento = new Processamento();
        Double soma = processamento.getSoma(a, b);

        Saida saida = new Saida();
        saida.imprimirNumeroDouble("Resultado da soma", soma);

    }

}
