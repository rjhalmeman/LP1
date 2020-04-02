package Main;

import java.util.Scanner;

/**
 *
 * @author radames
 */
class Entrada {

    Scanner teclado = new Scanner(System.in);

    public int lerNumeroInteiro(String mensagem) {
        int x = 0;
        while (true) {
            try {
                System.out.print(mensagem+":");
                x = teclado.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Erro, digite um inteiro");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }

    public double lerNumeroDouble(String mensagem) {
        double x = 0;
        while (true) {
            try {
                 System.out.print(mensagem+":");
                x = teclado.nextDouble();
                break;//saia do while
            } catch (Exception e) {
                System.out.println("Erro, digite um double");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }

}
