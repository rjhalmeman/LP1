package Main;

/**
 * @author Radames J Halmeman - rjhalmeman@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        Processamento processamento = new Processamento();
        Saida saida = new Saida();

        String s = entrada.lerString("Digite um nome completo");
        
        String nomeEmMaiusculas = processamento.tudoMaiusculo(s);
        String formatoBritanico = processamento.converterParaFormatoBritanico(s);        

        saida.imprimirString("Nome em maiúsculas", nomeEmMaiusculas);
        saida.imprimirString("Formato britânico",formatoBritanico);      
    }
}
