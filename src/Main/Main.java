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
        Processamento processamento = new Processamento();
        Saida saida = new Saida();

        String s = entrada.lerString("Digite um nome");
        String iniciais = processamento.getIniciais(s);
        
        saida.imprimirString(iniciais);

    }

}
