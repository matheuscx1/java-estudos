package academy.devdojo.maratonajava.Npolimorfismo.test;

import academy.devdojo.maratonajava.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Samsumg", 3000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Samsung 50 ", 5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------");
        CalculadoraImposto.calcularImposto(tv);

    }
}
