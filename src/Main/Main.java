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
        Scanner teclado = new Scanner(System.in);
        
        
        //entrada
        System.out.println("Digite um valor para B");
        double b = teclado.nextDouble();
        System.out.println("Digite um valor para C");
        double c = teclado.nextDouble();
        
        //processamento
        double a = Math.sqrt(b*b+c*c);
        
        //saída
        
        System.out.println("Hipotenusa:"+a);
    }
    
}
