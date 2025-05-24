package academy.devdojo.maratonajava.Gassociacao.dominio;

public class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    //Getter e setter são métodos usados para acessar e modificar os valores dos atributos de um objeto, respeitando o princípio do encapsulamento da Programação Orientada a Objetos (POO).
    //Getter: método que retorna o valor de um atributo (ex: getNome()).
    public String getNome() {
        return nome;
    }

    //Setter: método que define ou altera o valor de um atributo (ex: setNome(String nome)).
    //Eles permitem controlar o acesso aos dados internos do objeto, protegendo-os e mantendo a integridade, o que está diretamente relacionado ao pilar encapsulamento da POO.
    //Proteger a logica na classe do objeto. Nao ter acesso facil

    public void setNome(String nome) {
        this.nome = nome;
    }
}
