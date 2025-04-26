package academy.devdojo.maratonajava.BIntroducaometodosPOO.dominio;

//Desagio 2: criar uma calculadora que recebe uma lista ou array e retorna toda essa lista x2
// Se a entrada for [1,2,3] o retorno de [2, 4, 6]


import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraArrayDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner para o usuario digitar
        ArrayList<Integer> lista = new ArrayList<>(); //armazena os valores
        //ArrayList<Integer> — O que é isso?
        //ArrayList é uma classe do Java que representa uma lista que cresce dinamicamente.
        //Diferente de arrays normais (int[], String[]), que têm tamanho fixo,
        // o ArrayList pode crescer ou diminuir conforme você adiciona ou remove elementos.

        System.out.println("Digite os numeros");

        //O laço while continua rodando enquanto a condição for verdadeira.
        //Ele é útil quando o número de iterações (repetições) não é conhecido antes de começar o laço.
        //hasNextInt é usado para verificar se o próximo valor que o usuário vai digitar é um número inteiro.

        while(true){
            String entrada = scanner.nextLine(); // Lê a linha inteira
            if (entrada.isEmpty()) { // Verifica se o usuário pressionou Enter sem digitar nada
                break; // Sai do loop
            }
            try{
                int num = Integer.parseInt(entrada); //transforma a entrada que o usuario digitou em um numero inteiro
                lista.add(num);
            }catch (NumberFormatException e){//NumberFormatException é o tipo de exceção que ocorre quando você tenta converter uma string que não representa um número válido para um tipo numérico (como um int). // se o usuario digitar abc, vai lançar o errro
                System.out.println("Digite um numero valido");


            }
        }
        for (int i = 0; i < lista.size(); i++) {
            int num = lista.get(i); // <-- esse é outro 'num', só vive dentro do for
            int resultado = num * 2;
            System.out.println(resultado);


            //lista.size():
            //O lista.size() retorna o tamanho da lista, ou seja, quantos elementos ela contém.
            //No caso, depois que o usuário digita "123" e aperta Enter, a lista lista tem 1 elemento. Ou seja, lista.size() = 1.
            //O que o for faz?:
            //O for começa com i = 0.
            //O i é o índice da lista. Listas em Java são indexadas a partir de 0, então lista.get(0) vai pegar o primeiro número da lista.
            //No caso, lista.get(0) vai pegar o número 123, que foi adicionado à lista.
            //Dentro do loop:
            //Quando o código chega em int num = lista.get(i);, o num recebe o valor 123 (porque lista.get(0) é 123).
            //Depois, o código faz a multiplicação: resultado = num * 2;. Ou seja, resultado = 123 * 2 = 246.
            //O código então imprime 246 com System.out.println(resultado);.
            //Fim do loop:
            //Depois de imprimir 246, o valor de i é incrementado para 1.
            //O código verifica a condição do for (i < lista.size()). Nesse momento, i = 1 e lista.size() = 1, então a condição 1 < 1 é falsa.
            //O loop termina porque não há mais elementos na lista.


        }


    }
}
