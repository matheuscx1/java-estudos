package academy.devdojo.maratonajava.BIntroducaometodosPOO.test;

import academy.devdojo.maratonajava.BIntroducaometodosPOO.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(); //está instanciando a classe Calculadora
        calculadora.somaDoisNumero(); //método
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando");
    }
}

//Começa na linha 7, quando ir pra 8, ele volta lá pro método, executa e retorna pra Calculadora test de novo




