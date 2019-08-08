package Main;

/**
 * @author Radames J Halmeman - rjhalmeman@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        Processamento processamento = new Processamento();
        Saida saida = new Saida();
       
        
        double raio = entrada.lerNumeroDouble("Raio");
        double altura = entrada.lerNumeroDouble("Altura");

        double volume = processamento.calcularVolumeDoCilindro(raio,altura);

        saida.imprimirNumeroDouble("O volume do cilindro é", volume);

    }

}
