package academy.devdojo.maratonajava.Oexception.exception.dominio;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        super("Login inváligo");
    }
    //Exception customizado
    //Cria um tipo de exception chamada LoginInvalidoException que erda de Exception, o que chama um checked exception

    public LoginInvalidoException(String message) {
        super(message);//chama o construtor da pai da classe que é o Exception
    }
}
