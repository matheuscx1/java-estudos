package academy.devdojo.maratonajava.BIntroducaometodosPOO.dominio;

//Desafio: Criar uma calculadora que valida se um numero é primo ou não
// retornar true se for, false se não for


import java.util.Scanner;

public class CalculadoraDesafio {
    public static void main(String[] args) {

        int numeroPrimo; // Variável para armazenar o número informado pelo usuário
        int numDivisores = 0;  // Vamos contar os divisores de 'numeroPrimo'
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        numeroPrimo = scanner.nextInt(); // O número que o usuário digitou

        // Loop para contar os divisores do número

        //i++ serve para avançar o loop para o proximo valor, 1...2...3... e assim por diante
         for (int i = 1; i <= numeroPrimo; i++) {
            if (numeroPrimo % i == 0){
                //O operador de módulo (%) retorna o resto da divisão entre dois números.
                numDivisores++;
                //serve apenas para contar quantas divisoes possui
            }
        }


         //Verifica se o numero possui 2 divisoes, o de 1 e o dele mesmo ou seja 5/1 ou 5/1
        if (numDivisores == 2){
            System.out.println("é primo");
        }else{
            System.out.println("não é primo");
        }
    }

    //resto é tudo aquilo que sobra da divisao, ex: 7/3 = 2,333 resto, não é exato

    //Exemplo para o número 5:
    //Quando i = 1, 5 é divisível por 1, então numDivisores vai para 1.
    //
    //Quando i = 2, 5 não é divisível por 2, então o contador de divisores não muda.
    //
    //Quando i = 3, 5 não é divisível por 3, então o contador de divisores não muda.
    //
    //Quando i = 4, 5 não é divisível por 4, então o contador de divisores não muda.
    //
    //Quando i = 5, 5 é divisível por 5, então numDivisores vai para 2.

   //O fluxo no código é:
    //O código começa com i = 1.
    //Para cada valor de i (de 1 até numeroPrimo), ele verifica se numeroPrimo % i == 0:
    //Se for verdadeiro (resto 0), o número é divisível por i.
    //Se for falso (resto diferente de 0), o número não é divisível por i.
    //No final, o número de divisores de numeroPrimo é contado com o numDivisores++.
    //Se numDivisores for igual a 2 (o número tem exatamente 2 divisores: 1 e ele mesmo), o número é primo.
    //Se numDivisores for diferente de 2, o número não é primo.
}
