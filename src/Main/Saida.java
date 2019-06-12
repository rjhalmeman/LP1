package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
import java.text.DecimalFormat;

class Saida {

    public void imprimirNumeroDouble(String mensagem, double num) {
        DecimalFormat df = new DecimalFormat("###,##0.00");
        System.out.println(mensagem + "=>" + df.format(num));
    }

    public void imprimirAvisoString(String aviso) {
        System.out.println(aviso);
    }
}
