package Main;

import java.util.Scanner;

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

        int linhas = entrada.lerNumeroInteiro("Quantas linhas");
        int colunas = entrada.lerNumeroInteiro("Quantas Colunas");

        Processamento processamento = 
                new Processamento(linhas,colunas);
        Saida saida = new Saida();      
        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                int valor = entrada.
                        lerNumeroInteiro("Digite v[" + i + "]" + "[" + j + "]");
                processamento.adicionarElemento(i, j, valor);
            }
        }

        saida.imprimirMatriz(processamento.getMatriz());
    }

}
