package Main;

import java.util.Scanner;

/**
 *
 * @author radames
 */
class Entrada {

    Scanner teclado = new Scanner(System.in);
    public double lerNumeroDouble(String msg) {
        while (true) {
            try {
                System.out.print(msg + " =>");
                double x = teclado.nextDouble();
                return x;
            } catch (Exception e) {
                System.out.println("Erro,digite um double....");
                teclado = new Scanner(System.in);
            }
        }
    }
    public Integer lerNumeroInteiro(String msg) {
        while (true) {
            try {
                System.out.print(msg + " =>");
                Integer x = teclado.nextInt();
                return x;
            } catch (Exception e) {
                System.out.println("Erro,digite um inteiro....");
                teclado = new Scanner(System.in);
            }
        }
    }
}
