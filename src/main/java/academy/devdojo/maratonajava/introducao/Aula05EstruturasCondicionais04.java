package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // imprima o dia da semana considerando 1 como domingo
        byte dia = 5;

        switch (dia){
            case 1:
                System.out.println("Domingo");
                //Coloque o break se quiser parar a impressão
                break;
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

            case 7:
                System.out.println("Sabado");
                break;

                //Opção caso não funcione, use default
            default:
                System.out.println("Opção invalida");

        }


    }
}
