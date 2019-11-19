package Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Radames J Halmeman - rjhalmeman@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        Processamento processamento = new Processamento();
        Saida saida = new Saida();
        
        //entrada
        Date dataDeNascimento = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try {
            dataDeNascimento = sdf.parse(entrada.lerString("Digite uma hora"));
        } catch (ParseException ex) {
            System.out.println("Tá errado, corrija");
        }
        
        sdf = new SimpleDateFormat("HH:mm");
       
        System.out.println("a data lida foi: "+sdf.format(dataDeNascimento));
        
        CaixaDeFerramentas cf = new CaixaDeFerramentas();
        Date outraData = 
                cf.converteDeStringParaDate(
                        entrada.lerString("digite outra data"));
        
        System.out.println("a outra data lida foi: "+
                cf.converteDeDateParaString(outraData));
        

    }

}
