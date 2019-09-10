package Main;

import java.util.Scanner;

/**
 *
 * @author radames
 */
public class Entrada {

    Scanner teclado = new Scanner(System.in);

    public int tamanhoDaMatriz() {
        int t = 0;
        while (true) {
            try {
                System.out.print("Informe um número inteiro ímpar maior que 1 =>");
                t = teclado.nextInt();
                if (t % 2 != 0) {
                    break;
                } else {
                    t = 1/0;
                }

            } catch (Exception e) {
                System.out.println("Erro, escolha um número ímpar maior que 1");
                teclado = new Scanner(System.in);

            }
        }
        return t;
    }
}
