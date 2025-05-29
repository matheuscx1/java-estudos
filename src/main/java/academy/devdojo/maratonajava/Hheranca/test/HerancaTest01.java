package academy.devdojo.maratonajava.Hheranca.test;

import academy.devdojo.maratonajava.Hheranca.Endereco;
import academy.devdojo.maratonajava.Hheranca.Funcionario;
import academy.devdojo.maratonajava.Hheranca.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 1");
        endereco.setCep("123456-789");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Birituba");
        pessoa.setCpf("123456");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("-------------------");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Oda gênio");
        funcionario.setCpf("222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        funcionario.imprime();
    }
}
