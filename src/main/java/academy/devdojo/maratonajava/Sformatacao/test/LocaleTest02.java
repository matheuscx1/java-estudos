package academy.devdojo.maratonajava.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOCountries();
        for (String isoLanguage : isoLanguages){
            System.out.println(isoLanguage + " ");
        }
        System.out.println();
        for(String isoCountry : isoCountries){
            System.out.println(isoCountry + " ");
        }
    }
}
