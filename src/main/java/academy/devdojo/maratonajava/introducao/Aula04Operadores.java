package academy.devdojo.maratonajava.introducao;
/*
Operadores em java são usados para realizar operações matematicas, logicas e de comparação
 */

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        System.out.println(numero01 + numero02 );

        //%

        /*
        Usado quando vc quer verificar se um número é ímpar ou par

        Se o resto da divisão de um número por 2 for 0, o número é par
        Se o resto for 1, o número é ímpar
        
         */

        int resto = 20 % 2;
        System.out.println(resto);


        //Operadores logicos: < > <= >= == !
        // && → Só é true se ambas as condições forem verdadeiras.
        //|| → É true se pelo menos uma condição for verdadeira.
        //! → Inverte true para false e vice-versa.

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10.0;



        System.out.println("10 é maior que 20? " + isDezMaiorQueVinte);
        System.out.println("10 é menor que 20? " + isDezMenorQueVinte);
        System.out.println("10 é igual a 20? " + isDezIgualVinte);
        System.out.println("10 é igual a 10? " + isDezIgualDez);
        System.out.println("10 é diferente de 10.0? " + isDezDiferenteDez);

        // && (and) || (or) !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlay = 5000F;
        boolean isPlayCincoCompravel = valorTotalContaCorrente > valorPlay || valorTotalContaPoupanca > valorPlay;
                // Sempre compare dois valores
        System.out.println("isPlayCincoCompravel " + isPlayCincoCompravel);


        // = += -= *= /= %=

        double bonus = 1800; //1800
        bonus += 1000; //2800
        bonus -= 1000;  // 1800
        bonus *= 2;
        bonus /=2;
        bonus %= 2;
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++;
        contador--;
        //colocar antes = primeiro incrementa, dps executa.
        // colocar depois= primeiro executa dps incrementa
        System.out.println(contador);

    }
}
