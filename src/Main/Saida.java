package Main;

import java.text.DecimalFormat;

public class Saida {

    public void imprimirNumeroDouble(double num, String msg) {

        DecimalFormat df = new DecimalFormat("###,##0.00");

        System.out.println(msg + " => " + df.format(num));

    }

    public void imprimirAvisoString(String aviso) {

        System.out.println(aviso);

    }

}
