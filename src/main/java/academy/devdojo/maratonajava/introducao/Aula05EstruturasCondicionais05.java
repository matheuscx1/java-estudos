package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // imprima o dia da semana considerando 1 como domingo
        byte dia = 5;

        switch (dia){
            case 1:
                System.out.println("Domingo");
            case 2:
                System.out.println("Segunda");
            case 3:
                System.out.println("Terça");
            case 4:
                System.out.println("Quarta");
            case 5:
                System.out.println("Quinta");
            case 6:
                System.out.println("Sexta");
            case 7:
                System.out.println("Sabado");
        }


    }
}
