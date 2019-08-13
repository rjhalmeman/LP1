package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
class Processamento {

    public Double getSoma(double a, double b) {
        double resultado = a + b;
        return resultado;
    }

    String tudoMaiusculo(String s) {
        return s.toUpperCase();
    }

    String converterParaFormatoBritanico(String s) {
        String aux[] = s.split(" ");
        
        String resposta = aux[aux.length-1]+", ";
        for (int i = 0; i < aux.length-1; i++) {
            resposta +=aux[i]+" ";
        }
        return resposta;
    }
}
