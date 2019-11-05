package Main;

/**
 *
 * @author radames
 */
public class Passaro {
    private int id;
    private String nome;
    private String cor;
    private double peso;

    public Passaro() {
    }

    public Passaro(int id, String nome, String cor, double peso) {
        this.id = id;
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return id + ";" + nome + ";" + cor + ";" + peso;
    }   
    
    
}
