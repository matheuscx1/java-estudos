package academy.devdojo.maratonajava.Lclassesabstratar.test;

import academy.devdojo.maratonajava.Lclassesabstratar.dominio.Funcionario;
import academy.devdojo.maratonajava.Lclassesabstratar.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Matheus", 2000);
        Gerente gerente = new Gerente("Zoro", 5000);
        System.out.println(funcionario);
        System.out.println(gerente);
    }
}
