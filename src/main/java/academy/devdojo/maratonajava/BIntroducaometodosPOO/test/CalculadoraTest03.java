package academy.devdojo.maratonajava.BIntroducaometodosPOO.test;

import academy.devdojo.maratonajava.BIntroducaometodosPOO.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println("-------------");
        //System.out.println(calculadora.imprimeDivisaoDeDoisNumeros(20,25));
        //Erro pois a funcao é void



        //Como o método imprimeDivisaoDeDoisNumeros já faz o System.out.println(...) lá dentro, e ele é void (ou seja, não retorna nada), você só chama ele direto, assim
        calculadora.imprimeDivisaoDeDoisNumeros(86,20);// método correto
    }
}
