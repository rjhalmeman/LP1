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

        Entrada entrada = new Entrada();

        String s1;

        s1 = entrada.lerString("Digite uma string");
        s1 = s1.toLowerCase();
        
        s1 = s1.replace("ar", "XY");
        
        String s2 = "aaa;bbb;cccc;ddddddddd;ee;ii";
        String [] s3 = s2.split(";");
        for (int i = 0; i < s3.length; i++) {
            System.out.println(s3[i]);
        }
        
        System.out.println("s1 " + s1);

    }

}
