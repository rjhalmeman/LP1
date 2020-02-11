package Main;
public class Processamento {

    public double getMedia(int v1, int v2, int v3) {
        double m = (v1 + v2 + v3) / 3.0;// cuidado com as divisões, tipos inteiros retornam números inteiros
        return m;
    }
}
