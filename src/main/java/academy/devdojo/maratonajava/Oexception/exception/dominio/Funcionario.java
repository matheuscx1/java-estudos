package academy.devdojo.maratonajava.Oexception.exception.dominio;

import java.io.FileNotFoundException;
//Filho
//Funcionario está sobrescrevendo metodo Pessoa, ou seja, precisará seguir as regras de Pessoa
public class Funcionario extends Pessoa {
    public void salvar() throws LoginInvalidoException, ArithmeticException{
        System.out.println("Salvando funcionario");
    }
}
//mais para entrevistas