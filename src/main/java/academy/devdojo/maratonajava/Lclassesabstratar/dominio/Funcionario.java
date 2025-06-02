package academy.devdojo.maratonajava.Lclassesabstratar.dominio;

public class Funcionario {
    //protected é um modificador de acesso que se coloca em classes, metodos ou variaveis para controlar quem pode ver ou usar
    //usado dentro do mesmo pacote ou por classes filhas(subclasses)
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
