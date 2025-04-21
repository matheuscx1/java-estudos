package academy.devdojo.maratonajava.introducaoJava;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double 0
        //char '\u0000 ' ' '
        //boolean false
        // String null
        String[] nomes = new String[3];
        nomes[0] = "Biriri";
        nomes[1] = "Xurimini";
        nomes[2] = "JIJI";

        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);
        }
        // percorre a quatidade do array

        for (int i = 0; i <nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        //Adicionando variavel + .length, voce acessa a quatidade do array do mesmo jeito
    }
}
