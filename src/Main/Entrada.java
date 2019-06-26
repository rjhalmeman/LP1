package Main;

import java.util.Scanner;

public class Entrada {

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
                int x = teclado.nextInt();
                return x;
            } catch (Exception e) {
                System.out.println("Erro,digite um inteiro....");
                teclado = new Scanner(System.in);
            }
        }
    }

    public boolean continuar(String msg) {
        while (true) {
            try {
                System.out.print(msg + " (S ou N) =>");
                char x = teclado.next().charAt(0);
                if (x == 's' || x == 'S') {
                    return true;
                } else if (x == 'n' || x == 'N') {
                    return false;
                } else {
                    int a = 3 / 0;//provocar um erro propositalmente
                }
            } catch (Exception e) {
                System.out.println("Erro, são válidas as letras S ou N");
                teclado = new Scanner(System.in);
            }
        }
    }
}
