package Main;

/**
 *
 * @author radames
 */
class Processamento {

    int quantosAnos(int achico, int aze) {

        int cont = 0;
        while (achico >= aze) {
            cont++; //cont = cont+1; 
            achico += 2;
            aze += 3;
        }
        return cont;
    }

    public double calcularIMC(double peso, double altura) {
        double imc = 0;
        imc = peso / (altura * altura);
        return imc;
    }

    public String classificarIMC(double imc) {
        String classificacao = "";
        if (imc < 16) {
            classificacao = "abaixo do peso grau III";
        } else if (imc < 17) {
            classificacao = "abaixo do peso grau II";
        } else if (imc < 18.5) {
            classificacao = "abaixo do peso grau I";
        } else if (imc < 25) {
            classificacao = "peso ideal";
        } else if (imc < 30) {
            classificacao = "sobre peso";
        } else if (imc < 35) {
            classificacao = "obesidade grau I";
        } else if (imc < 40) {
            classificacao = "obesidade grau II";
        } else {
            classificacao = "obesidade grau III";
        }
        return classificacao;
    }

}
