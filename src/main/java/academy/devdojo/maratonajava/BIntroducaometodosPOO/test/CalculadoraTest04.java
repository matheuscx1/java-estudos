package academy.devdojo.maratonajava.BIntroducaometodosPOO.test;

import academy.devdojo.maratonajava.BIntroducaometodosPOO.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 =1;
        int num2 = 2;
        //Aqui, num1 e num2 são as variáveis originais, ou seja, são as variáveis que existem no seu CalculadoraTest04.
        // Esses valores começam como 1 e 2.
        // "Esses são os valores originais. Agora vou chamar o método e mandar CÓPIAS desses valores pra lá"

        // Aqui o Java pensa:
        // "Ok, o método espera dois números. Tenho 1 e 2.
        // Mas dentro do método vai ter uma alteração pra 99 e 33.
        // Então eu não posso mexer nos valores originais.
        // Vou fazer uma cópia e passar essas cópias pro método."


        calculadora.alteraDoisNumeros(num1, num2);




        System.out.println("Dentro CalculadoraTest04");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);

    }
}
