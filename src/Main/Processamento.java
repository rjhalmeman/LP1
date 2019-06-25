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

}
