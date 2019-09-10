package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
class Processamento {

    int[][] matriz;
    int i = 0;

    public Processamento(int linhas, int colunas) {

        matriz = new int[linhas][colunas];
    }

    public void adicionarElemento(int x, int y, int valor) {
        matriz[x][y] = valor;
    }

    public int getElemento(int x, int y) {
        return matriz[x][y];
    }

    public int[] getDiagonalPrincipal() {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int diagonal[] = new int[linhas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == j) {
                    diagonal[i] = matriz[i][j];
                }
            }
        }
        return diagonal;
    }

    public int[][] getMatriz() {
        return matriz;
    }
}
