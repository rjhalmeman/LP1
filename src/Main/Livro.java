
package Main;

/**
 *
 * @author radames
 */
public class Livro {
    private int idLivro;
    private String nomeLivro;
    private String autorLivro;

    public Livro() {
    }

    public Livro(int idLivro, String nomeLivro, String autorLivro) {
        this.idLivro = idLivro;
        this.nomeLivro = nomeLivro;
        this.autorLivro = autorLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    @Override
    public String toString() {
        return  idLivro + ";" + nomeLivro + ";" + autorLivro; //csv
    }

   
    
    
    
    
    
}
