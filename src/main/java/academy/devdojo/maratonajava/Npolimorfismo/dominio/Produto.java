package academy.devdojo.maratonajava.Npolimorfismo.dominio;

//um método abstrato não tem corpo
//uma classe abstrata pode ter alguns métodos implemetnados
//essa classe produto não deve existir, por isso ela é abastract
public  abstract class Produto implements Taxavel {
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
