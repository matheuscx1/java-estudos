package academy.devdojo.maratonajava.Exercicios;

//Dado um determinado salario anual, qual será o valor pago baseado no imposto?

public class Exercicio01EstruturasCondicionais {
    public static void main(String[] args) {
        double salario = 34712;
        double taxa1 = 9.70;
        double taxa2 = 37.55;
        double taxa3 = 49.50;

        if(salario <= 34712){
            System.out.println("Você devera pagar: " + salario * taxa1 / 100);
        } else if (salario <= 68507) {
            System.out.println("Você devera pagar: " + salario * taxa2 / 100);
        }else{
            System.out.println("Você devera pagar: " + salario * taxa3 / 100);

    }
}
}

//Forma mais simplficada

/*
public class Exercicio01EstruturasCondicionais {
    public static void main(String[] args) {
        double salario = 34712;
        double taxa1 = 9.70;
        double taxa2 = 37.55;
        double taxa3 = 49.50;
        double imposto;

        if (salario <= 34712) {
            imposto = salario * taxa1 / 100;
        } else if (salario <= 68507) { // Não precisa do "salario >= 34713"
            imposto = salario * taxa2 / 100;
        } else {
            imposto = salario * taxa3 / 100;
        }

        System.out.printf("Você deverá pagar: R$ %.2f%n", imposto);
    }
}
 */
