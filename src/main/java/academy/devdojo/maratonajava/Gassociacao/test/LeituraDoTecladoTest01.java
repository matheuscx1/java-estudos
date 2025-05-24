package academy.devdojo.maratonajava.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        String nome = teclado.nextLine();
        System.out.println("Digite a idade");
        int idade = teclado.nextInt();
        System.out.println("Digite M ou F para sexo");
        char sexo = teclado.next().charAt(0);
        System.out.println("--------------------");
        System.out.println("Nome " + nome);
        System.out.println("Idade " + idade);
        System.out.println("Sexo " + sexo);
    }
}
