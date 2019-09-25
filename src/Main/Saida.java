package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
import java.text.DecimalFormat;

class Saida {

    public void imprimirNumeroDouble(String msg, double num) {
        //formata e imprime um número double
        DecimalFormat df = new DecimalFormat("###,##0.00");
        System.out.println(msg + " => " + df.format(num));
    }

    public void imprimirString(String msg, String s) {
        System.out.println(msg + ": " + s);
    }

    public void imprimirMatriz(String msg, int matriz[][]) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        System.out.println(msg);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public void imprimirVetor(String msg, int vetor[]) {
        System.out.println(msg);
        int linhas = vetor.length;
        for (int i = 0; i < linhas; i++) {
            System.out.println(vetor[i]);
        }
    }
}
