package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
class Processamento {

    private int chefe = 0;
    int eddie = 0;
    int lou = 0;
    int homer;
    int direcaoPerigosa = 0;

    private int ocorrencias = 0;

    public int getProximaOcorrencia() {
        ocorrencias++;
        return ocorrencias;
    }

    public void setChamado(int chamado) {
        this.ocorrencias = chamado;
    }

    public void setChefe() {
        this.chefe++;
    }

    String getQuemAtende() {
        String q = "Lou";
        if (chefe <= eddie && chefe <= lou) {
            chefe++;
            q = "Chefe Clancy";
            return q.toUpperCase();
        }
        if (eddie <= chefe && eddie <= lou) {
            if (eddie <= lou) {
                eddie++;
                q = "Eddie";
                return q.toUpperCase();
            }
        }
        if (lou <= chefe && lou <= eddie) {
            lou++;
            q = "Lou";
            return q.toUpperCase();
        }
        return q.toUpperCase();
    }

    public String atendimentos() {
        return "Atendimentos{" + "Chefe Clancy=" + chefe + ", Eddie=" + eddie + ", Lou=" + lou + '}';
    }

    void setHomer() {
        homer++;
    }

    String getNomeNivel(int nivel) {
        String nome = "";
        switch (nivel) {
            case 1:
                nome = "Baixo";
                break;
            case 2:
                nome = "Médio";
                break;
            case 3:
                nome = "Alto";
                break;
            default:
                nome = "erro no nível";
        }
        return nome.toUpperCase();
    }
    
    void contarDirecaoPerigosa(){
          direcaoPerigosa++;
    }

    String getNomeTipoOcorrencia(int tipoOcorrencia) {
        String nome = "";
        switch (tipoOcorrencia) {
            case 1:
                nome = "Direção Perigosa";              
                break;
            case 2:
                nome = "Barulho";
                break;
            case 3:
                nome = "Bebedeira";
                break;
            case 4:
                nome = "Homer";
                break;
            default:
                nome = "erro no tipo de ocorrência";
        }
        return nome.toUpperCase();
    }

    int getHomer() {
        return homer;
    }

    double getPercentualDirecaoPerigosa() {
        if (direcaoPerigosa > 0) {          
            return (Double.valueOf(direcaoPerigosa) / Double.valueOf(ocorrencias));
        } else {
            return 0;
        }

    }

}
