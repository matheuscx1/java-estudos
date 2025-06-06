package academy.devdojo.maratonajava.Lclassesabstratar.dominio;

public abstract class Funcionario extends Pessoa{
    //classes abastratas não podem ser instanciadas
    //classes abstratas são como um molde que define atributos comuns
    //protected é um modificador de acesso que se coloca em classes, metodos ou variaveis para controlar quem pode ver ou usar
    //usado dentro do mesmo pacote ou por classes filhas(subclasses)
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void imprime() {
        System.out.println("imprimindo...");
    }

    public abstract void calculaBonus();

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
