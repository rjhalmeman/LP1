package Main;

/**
 * @author Radames J Halmeman - rjhalmeman@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        int nivel = 0;
        String quemAtende = "";
        Entrada e = new Entrada();
        Processamento p = new Processamento();
        Saida s = new Saida();

        while (true) {
            int chamado = p.getProximaOcorrencia();
            s.imprimirString("\nNúmero da ocorrência=>" + chamado);
            s.imprimirString("1 - Direção perigosa");
            s.imprimirString("2 - Barulho");
            s.imprimirString("3 - Bebedeira");
            s.imprimirString("4 - Homer");
            s.imprimirString("0 - Sair do sistema de ocorrências");

            int tipoOcorrencia = e.lerNumeroInteiro("\nQual o tipo de ocorrência?");
            if (tipoOcorrencia == 0) {
                System.exit(0);//sair
            } else {
                if (tipoOcorrencia == 4) {
                    nivel = 3;//alto
                    quemAtende = "Chefe Clancy";
                    p.setChefe();
                    p.setHomer();
                } else {
                    s.imprimirString(p.getNomeTipoOcorrencia(tipoOcorrencia));
                    if (tipoOcorrencia==1) {
                         p.contarDirecaoPerigosa();
                    }
                    s.imprimirString("\nNível");
                    s.imprimirString("1 = baixo");
                    s.imprimirString("2 = médio");
                    s.imprimirString("3 = alto");
                    nivel = e.lerNumeroInteiro("\nQual o nível de gravidade?");
                    quemAtende = p.getQuemAtende();
                }

            }

            s.imprimirString("\n\nOcorrência do tipo=>" + p.getNomeTipoOcorrencia(tipoOcorrencia) + " - com nível=>" + p.getNomeNivel(nivel) + " - atendida por=>" + quemAtende);
            s.imprimirString("Ocorrências tipo HOMER: "+p.getHomer());
            s.imprimirPercentual("Percentual de DIREÇÃO PERIGOSA:",p.getPercentualDirecaoPerigosa());
            
            
            s.imprimirString(p.atendimentos());
            if (!e.lerConfirmacao("Continuar?")) {
                break;
            }
        }
    }

}
