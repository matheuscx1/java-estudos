package academy.devdojo.maratonajava.Hheranca;


//Uma classe que herda os campos de outros? Exemplo: um funcionário pode herdar atributos de uma classe Pessoa, porque Funcionário também é uma pessoa, só tem algumas especificações.
//Por isso usamos o extends, vc usa quando que extender os funcionalidades de outra classe, ou seja, manter o relacionamento entre elas
public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario() {
        this.salario = salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
