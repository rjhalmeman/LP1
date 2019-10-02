package Main;

import java.util.ArrayList;
import java.util.List;
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
        List<Contato> listaContato = new ArrayList<>();

        Contato contato = new Contato();
        contato.setNumCelular("999706070");
        contato.setNomeContato("Timocreia");
        listaContato.add(contato);//adiciona na lista

        contato = new Contato();
        contato.setNumCelular("999595959");
        contato.setNomeContato("Creuzina");
        listaContato.add(contato);//adiciona na lista

        contato = new Contato();
        contato.setNumCelular("9999876544");
        contato.setNomeContato("Um Dois Três de Oliveira Quatro");
        listaContato.add(contato);//adiciona na lista

        for (Contato c : listaContato) {//printa a lista
            System.out.println(c);
        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("digite uma frase");
//        String frase = scanner.nextLine();
//        for (int i = 0; i < frase.length(); i++) {
//            System.out.println(Integer.valueOf(frase.charAt(i)));
//        }
    }

}
