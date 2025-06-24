package academy.devdojo.maratonajava.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


//customizar datas
public class SimpleDateFormatTEst01 {
    public static void main(String[] args) {
        String pattern = "'California' dd 'de' MMMM 'de' yyyy";
         SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("California 23 de junho de 2025"));
        } catch (ParseException e) {//quando o java tenta converter uma string em um formato especifico(como data ou numero), mas a string nao combina com o formato esperado
            //prevenir o programa de crashar quando um valor nao pode ser convertido para o tipo esperado
            throw new RuntimeException(e);
        }

    }
}
