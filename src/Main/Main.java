/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        double valorPago = entrada.lerNumeroDouble("Digite a quantidade de dinheiro");
        double valorProduto = entrada.lerNumeroDouble("Digite o valor do produto");

        Processamento processamento = new Processamento();
        Double resposta
                = processamento.calcularTroco(valorPago, valorProduto);

        Saida saida = new Saida();

        saida.imprimirNumeroDouble(resposta, "Troco");
    }

}
