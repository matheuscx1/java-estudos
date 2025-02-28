package academy.devdojo.maratonajava.Exercicios;

public class Exercicio02EstruturasCondicionais {
    public static void main(String[] args) {
        // Dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        //Considerando um como domingo
        byte dia = 7;

        switch (dia){
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;

            default:
                System.out.println("Fim de semana");
        }

    }
}


//Corrigido

/*
public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch para classificar dias de 1 a 7, onde 1 é domingo.
        byte dia = 1;  // Você pode alterar esse valor para testar outros dias.

        switch (dia) {
            case 1: // Domingo
            case 7: // Sábado
                System.out.println("FDS");  // Final de semana
                break;
            case 2: // Segunda-feira
            case 3: // Terça-feira
            case 4: // Quarta-feira
            case 5: // Quinta-feira
            case 6: // Sexta-feira
                System.out.println("Dia útil");  // Dia útil
                break;
            default:
                System.out.println("Opção inválida");  // Caso não seja entre 1 e 7
                break;
        }
    }
}

 */
