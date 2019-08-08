package Main;

/**
 * @author Radames J Halmeman - rjhalmeman@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        Processamento processamento = new Processamento();
        Saida saida = new Saida();

        //entrada de dados
        double x1 = entrada.lerNumeroDouble("X1");
        double y1 = entrada.lerNumeroDouble("Y1");
        double x2 = entrada.lerNumeroDouble("X2");
        double y2 = entrada.lerNumeroDouble("Y2");
        
        
        Double d=processamento.getDistancia(x1,y1,x2,y2);
        

        saida.imprimirNumeroDouble("Distância", d);

    }

}
