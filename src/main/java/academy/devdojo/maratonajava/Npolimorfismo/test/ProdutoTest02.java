package academy.devdojo.maratonajava.Npolimorfismo.test;

import academy.devdojo.maratonajava.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.Npolimorfismo.dominio.Tomate;

//declara a variavel produto como sendo do tipo Produto(classe)
//Pode acessar todos os métodos da classe Produto
//new Computador("Alien X", 5000); cria o objeto atual na memoria do tipo Computador

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Alien X", 5000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println("---------------");
        Produto produto2 = new Tomate("Americano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
    }
}
