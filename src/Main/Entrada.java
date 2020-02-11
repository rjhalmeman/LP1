package Main;
import java.util.Scanner;
public class Entrada {
    Scanner teclado = new Scanner(System.in);    
    public int getValorInteiro(String mensagem){
        System.out.print(mensagem+" =>");
        return teclado.nextInt();
    }
}
