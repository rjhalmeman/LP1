package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
class Processamento {

    double maior = -1;
    double menor = 11;

    double getMediaAluno(double n1, double n2, double n3) {
        double media = (n1 + n2 + n3) / 3;
        if (media < menor) {
            menor = media;
        }
        if (media > maior) {
            maior = media;
        }
        return media;
    }

    String getSituacao(double mediaAluno) {
        if (mediaAluno < 5) {
            return "Reprovado";
        } else {
            return "Aprovado";
        }
    }

    double getMaior() {
        return maior;
    }

    double getMenor() {
        return menor;
    }
}
