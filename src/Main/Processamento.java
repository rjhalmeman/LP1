package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
class Processamento {

    private double somaMedias = 0;
    private int cont = 0;

    public double mediaAluno(double n1, double n2, double n3) {
        double m = (n1 + n2 + n3) / 3;
        somaMedias += m;
        cont++;
        return m;
    }

    public String getSituacao(double mediaAluno) {
        if (mediaAluno < 5) {
            return "Reprovado";
        } else {
            return "Aprovado";
        }
    }

    public double getMediaTurma() {
        return somaMedias / cont;
    }
}
