package Main;

import java.text.DecimalFormat;

/**
 *
 * @author radames
 */
public class Aluno {
    private  String RA;
    private String nome;
    private double coeficiente;
    private String email;
    private String nomeDaMae;

    public Aluno() {
        System.out.println("passou no construtor vazio");
    }

    public Aluno(String RA, String nome, 
            double coeficiente, 
            String email, String nomeDaMae) {
        this.RA = RA;
        this.nome = nome;
        this.coeficiente = coeficiente;
        this.email = email;
        this.nomeDaMae = nomeDaMae;
        System.out.println("passou no outro construtor");
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(double coeficiente) {
        this.coeficiente = coeficiente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "O aluno ===>{" + "RA=" + 
                RA + ", nome=" + nome + 
                ", coeficiente=" + new DecimalFormat("0.0").format(coeficiente) + ", "
                + "email=" + email + ", nomeDaMae=" + 
                nomeDaMae + '}';
    }

   
}
