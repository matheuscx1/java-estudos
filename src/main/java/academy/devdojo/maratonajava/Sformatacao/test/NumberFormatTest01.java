package academy.devdojo.maratonajava.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
//formatação numeros usando local
public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[3];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localeIT);
        double valor = 1_000.2130;
        for (NumberFormat numberFormat : nfa) {
            numberFormat.setMaximumFractionDigits(2);//controla quandos digitos depois do ponto decimal qunado formatar o numero
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "1_000.2130";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
