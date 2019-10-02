
package Main;

/**
 *
 * @author radames
 */
public class Contato {
    private String numCelular;
    private String nomeContato;

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    @Override
    public String toString() {
        return "Contato{" + "numCelular=" + numCelular + ", nomeContato=" + nomeContato + '}';
    }
    
    
    
    
}
