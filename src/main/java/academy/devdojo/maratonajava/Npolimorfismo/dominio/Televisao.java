package academy.devdojo.maratonajava.Npolimorfismo.dominio;

public class Televisao extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    public double calcularImposto() {
        System.out.println("Calculando imposto da televisão");
        return  this.valor * IMPOSTO_POR_CENTO;
    }
}
