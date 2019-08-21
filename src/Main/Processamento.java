package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
class Processamento {

    public String ordenarStrings(String s1, String s2, String s3) {
        String aux = "";
        if (s1.compareTo(s2) > 0) {
            aux = s1;
            s1 = s2;
            s2 = aux;
        }
        if (s2.compareTo(s3) > 0) {
            aux = s2;
            s2 = s3;
            s3 = aux;
        }
        if (s1.compareTo(s2) > 0) {
            aux = s1;
            s1 = s2;
            s2 = aux;
        }

        return s1 + " - " + s2 + " - " + s3;
    }
}
