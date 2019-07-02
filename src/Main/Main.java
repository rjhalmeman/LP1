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

        //entrada de dados
        Entrada entrada = new Entrada();
        double peso = entrada.lerNumeroDouble("Digite o peso");
        double altura = entrada.lerNumeroDouble("Digite a altura");

        Processamento processamento = new Processamento();
        double imc = processamento.calcularIMC(peso, altura);

        String classificacao = processamento.classificarIMC(imc);
        
        Saida saida = new Saida();
        saida.imprimirNumeroDouble(imc, "IMC");
        saida.imprimirAvisoString(classificacao);
    }

}
