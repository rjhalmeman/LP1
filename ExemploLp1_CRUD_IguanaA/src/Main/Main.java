package Main;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Controle controle = new Controle();

        aluno.setRA("A123");
        aluno.setNome("Côrtes");
        aluno.setCoeficiente(0.89);
        aluno.setEmail("cortes@algo.com.br");
        aluno.setNomeDaMae("Eliana");
        controle.adicionar(aluno);       
        
        
        System.out.println("---------");

        aluno = new Aluno("A987", "Berola", 0.99, "ber@ber.com", "Berolina");
        controle.adicionar(aluno);
        
        List<Aluno> la = controle.listar();
        
        for (Aluno oAluno : la) {
            System.out.println(oAluno.toString());
        }

    }

}
