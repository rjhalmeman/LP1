package Main;

/**
 * @author Radames J Halmeman - rjhalmeman@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        Processamento processamento = new Processamento();
        Saida saida = new Saida();
        
        //entrada
        String s1 = entrada.lerString("Primeira string");
        String s2 = entrada.lerString("Segunda string");
        String s3 = entrada.lerString("Terceira string");
       

        //processamento
        String resp = processamento.ordenarStrings(s1,s2,s3);

        //saída
        saida.imprimirRotuloEString("Strings ordenadas", resp);

    }

}
