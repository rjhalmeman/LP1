

package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com

import java.util.Scanner;

class Entrada {
Scanner teclado = new Scanner(System.in);

    public Double lerNumeroDouble(String msg) {
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
                int x = teclado.nextInt();
                return x;
            } catch (Exception e) {
                System.out.println("Erro,digite um inteiro....");
                teclado = new Scanner(System.in);
            }
        }
    }


}
