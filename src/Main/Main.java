package Main;

/**
Escreva um programa que dado um valor numérico digitado pelo usuário (armazenado em uma 
* variável inteira), imprima cada um dos seus dígitos por extenso. Exemplo: 
* Entre o número: 4571 Resultado: quatro, cinco, sete, um.
 */
public class Main {

    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        Processamento processamento = new Processamento();
        Saida saida = new Saida();
        
        int n = entrada.lerNumeroInteiro("digite um número inteiro");
        
        String resposta = processamento.nomesDosDigitos(n);
        
        saida.imprimirRotuloEString("Números por extenso", resposta);

    }

}
