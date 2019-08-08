package Main;

/**
 * @author Radames J Halmeman - rjhalmeman@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        Processamento processamento = new Processamento();
        Saida saida = new Saida();
        while (true) {
            int codigo = entrada.lerNumeroInteiro("digite o código do aluno");
            if (codigo<0) {
                break;
            }
            double n1 = entrada.lerNumeroDouble("Nota 1");
            double n2 = entrada.lerNumeroDouble("Nota 2");
            double n3 = entrada.lerNumeroDouble("Nota 3");
            
            double mediaAluno = processamento.getMediaAluno(n1, n2, n3);

            saida.imprimirNumeroInteiro("Código do aluno", codigo);
            saida.imprimirNumeroDouble("N1", n1);
            saida.imprimirNumeroDouble("N2", n2);
            saida.imprimirNumeroDouble("N3", n3);
            saida.imprimirNumeroDouble("Média do aluno", mediaAluno);
            String situacao = processamento.getSituacao(mediaAluno);
            saida.imprimirAvisoString(situacao);
        }
        double maior = processamento.getMaior();
        double menor = processamento.getMenor();
        saida.imprimirNumeroDouble("maior nota", maior);
        saida.imprimirNumeroDouble("menor nota", menor);
    }

}
