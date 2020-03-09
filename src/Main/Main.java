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
       //entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor B");//print
        int b = teclado.nextInt();
        System.out.println("Digite o valor C");//print
        int c = teclado.nextInt();
        
      // processamento
      int a = b+c;
      
      //saida
        System.out.println("Soma:"+a);
        

    }

}
