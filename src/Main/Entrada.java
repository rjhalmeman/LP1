package Main;

import java.util.Scanner;

/**
 *
 * @author radames
 */
class Entrada {

    Scanner teclado = new Scanner(System.in);
    public void pausaEnter(){
        System.out.println("Pressione [Enter] para continuar");
        teclado.nextLine();
    }

    public String lerString(String mensagem) {
        String s = "";
        while (true) {
            System.out.print(mensagem + ": ");
            s = teclado.nextLine();
            s = s.trim();//retira espaços em branco
            if (!s.equals("")) {
                break;
            } else {
                System.out.println("Digite uma string não vazia");
            }
        }

        return s;
    }

    public int lerNumeroInteiro(String mensagem) {
        int x = 0;
        while (true) {
            try {
                System.out.print(mensagem + ":");
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
                System.out.print(mensagem + ":");
                x = teclado.nextDouble();
                break;//saia do while
            } catch (Exception e) {
                System.out.println("Erro, digite um double");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }
    
   

    public boolean lerConfirmacao(String msg) {
        //ler uma resposta sim ou não do usuário
        while (true) {
            try {
                System.out.print(msg + " (S ou N) ");
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
