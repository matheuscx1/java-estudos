package academy.devdojo.maratonajava.Npolimorfismo.dominio;

//Se a classe principal implementa uma classe interface, logo todas as classe que extendem a principal precisam ser abstract
//mas se vc escreve @override, então nao precisa

public class Computador  extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.21;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Computador");
        return  this.valor * IMPOSTO_POR_CENTO;
    }






}
