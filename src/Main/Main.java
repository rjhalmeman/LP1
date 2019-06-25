/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author radames
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        //entrada de dados
        int achico = 150;
        int aBento = 110;
        
        
        Processamento processamento = new Processamento();
       int resposta = processamento.quantosAnos(achico,aBento);
        
       Saida saida = new Saida();
        saida.imprimirNumeroInteiro(resposta, "Quantidade de anos");
    }

}
