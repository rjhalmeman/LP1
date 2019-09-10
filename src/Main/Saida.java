package Main;

/**
 *
 * @author radames
 */
public class Saida {

    void imprimirMatrizInt(int[][] mat) {
        String aux = "";
        int max = mat.length * mat[0].length;
        int tam = String.valueOf(max).length();
        String risco = "";
        for (int i = 0; i < mat.length * tam + mat.length; i++) {
            risco += "-";
        }
        System.out.println(risco);       
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                aux = "        " + String.valueOf(mat[j][i]);
                aux = aux.substring(aux.length() - tam, aux.length());
                System.out.print(aux + "|");
            }
            System.out.println("");
            System.out.println(risco);
            
        }
        
    }
}
