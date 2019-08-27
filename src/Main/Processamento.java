package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
class Processamento {

    String nomesDosDigitos(int n) {
        String sn = String.valueOf(n);
        System.out.println("sn " + sn);
        String aux = "";
        String resp = "";
        for (int i = 0; i < sn.length(); i++) {               
            switch (Character.valueOf(sn.charAt(i))) {
                case '0':
                    aux = " zero";
                    break;
                case '1':
                    aux = " um";
                    break;
                case '2':
                    aux = " dois";
                    break;
                case '3':
                    aux = " três";
                    break;
                case '4':
                    aux = " quatro";
                    break;
                case '5':
                    aux = " cinco";
                    break;
                case '6':
                    aux = " seis";
                    break;
                case '7':
                    aux = " sete";
                    break;
                case '8':
                    aux = " oito";
                    break;
                case '9':
                    aux = " nove";
                    break;
                default:
                    aux = " erro ";
            }
            resp += aux;
        }
        return resp;
    }
}
