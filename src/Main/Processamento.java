package Main;

public class Processamento {

    private int tam;
    private int[][] mat;

    public Processamento(int tam) {
        this.tam = tam;
        mat = new int[tam][tam];
    }

    public void gerar() {
        int linhas = mat.length - 1;
        int colunas = mat[0].length - 1;
        int x = linhas;
        int y = linhas / 2;
        for (int i = 0; i < mat.length * mat.length; i++) {
            mat[x][y] = i + 1;
            x = (x + 1) % (linhas + 1);
            y = (y + 1) % (linhas + 1);
            if (mat[x][y] != 0) {
                x = (x + 1) % (linhas + 1);
                y = (y + 2) % (linhas + 1);
            }
        }
    }

    public int[][] getMat() {
        gerar();
        return mat;
    }
}
