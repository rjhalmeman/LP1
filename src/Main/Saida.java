package Main;

import java.text.DecimalFormat;

/**
 *
 * @author radames
 */
class Saida {

    public void imprimirNumeroInteiro(String mensagem, int i) {
        System.out.println(mensagem + ":" + i);
    }

    public void imprimirNumeroDouble(String mensagem, double numero) {
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        System.out.println(mensagem + ":" + decimalFormat.format(numero));
    }

}
