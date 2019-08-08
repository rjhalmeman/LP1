package Main;

/*
 Escreva um programa que leia, para um número indeterminado de alunos, o código do aluno e três notas. 
Calcule a média do aluno e mostre o código do aluno, suas três notas, a média do aluno e uma mensagem de 
"APROVADO" se a média for maior ou igual a 5 e "REPROVADO" se a média for menor que 5. 
Repita a operação até que o código de aluno lido seja negativo. Imprima a média da turma. (6 pontos)
 */
public class Main {
    
    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        Processamento processamento = new Processamento();
        Saida saida = new Saida();
        
        while (true) {
            double cod = entrada.lerNumeroDouble("Digite o código");
            if (cod < 0) {
                break;
            } else {
                double n1 = entrada.lerNumeroDouble("N1");
                double n2 = entrada.lerNumeroDouble("N2");
                double n3 = entrada.lerNumeroDouble("N3");
                double mediaAluno = processamento.mediaAluno(n1, n2, n3);
                String situacao = processamento.getSituacao(mediaAluno);
                saida.imprimirAvisoString(cod + " - " + n1 + " - " + n2 + " - " + n3 + " - " + mediaAluno + " - " + situacao);
            }
        }
        
        saida.imprimirNumeroDouble("Média da turma", processamento.getMediaTurma());
        
    }
    
}
