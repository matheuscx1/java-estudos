package academy.devdojo.maratonajava.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.Jmodificadorfinal.dominio.Comprador;
import academy.devdojo.maratonajava.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Matheus");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("sf90");
        ferrari.imprime();

    }
}
