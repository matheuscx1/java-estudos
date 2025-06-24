package academy.devdojo.maratonajava.Oexception.exception.test;

import academy.devdojo.maratonajava.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
    private static void logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuario");
        String usarnameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigita = teclado.nextLine();
        if(!usernameDB.equals(usarnameDigitado) || !senhaDB.equals(senhaDigita)){
            throw new LoginInvalidoException("Usuario ou senha inválidos");
        }
        System.out.println("Usuário logado com sucesso");
    }
}
