package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
class Processamento {

    public Double getSoma(double a, double b) {
        double resultado = a + b;
        return resultado;
    }

    Double getDistancia(double x1, double y1, double x2, double y2) {
            double d = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
           // double d = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
           return d;
    }
}
