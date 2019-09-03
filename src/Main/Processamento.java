package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
class Processamento {

    int v[] ;
    int i = 0;

    public Processamento(int tamanho) {
        v = new int[tamanho];
    }    
    
    public void adicionarElemento(int x) {
        v[i] = x;
        i++;
    }
    
    public int getElemento(int posicao){
        return v[posicao];
    }

}
