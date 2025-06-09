package academy.devdojo.maratonajava.Hheranca.dominio;

//Protect: dá acesso direto a variavel a todas as subclasses independentes de onde elas estiverem
//Porem, todas as classes do mesmo pacote terão acesso


//Uma classe que herda os campos de outros? Exemplo: um funcionário pode herdar atributos de uma classe Pessoa, porque Funcionário também é uma pessoa, só tem algumas especificações.
//Por isso usamos o extends, vc usa quando que extender os funcionalidades de outra classe, ou seja, manter o relacionamento entre elas
public class Funcionario extends Pessoa {
    private double salario;

    static{
        System.out.println("Dentro do bloco de inicialização estático Funcionario");
    }

    {
        System.out.println("Dento do bloco inicialização Funcionario 1");
    }
    {
        System.out.println("Dento do bloco inicialização Funcionario 2");
    }


    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    //Sobrescrevendo a classe pai
    public void imprime(){
        //se refere ao objeto que é o objeto mais generico, no caso Pessoa
        super.imprime();//Execute o imprime, que vem do método pessoa, mas agora adicione o salario
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu" + this.nome + " Recebi o salario de " + this.salario);

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
