package academy.devdojo.maratonajava.Oexception.exception.test;

import academy.devdojo.maratonajava.Oexception.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.Oexception.exception.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
