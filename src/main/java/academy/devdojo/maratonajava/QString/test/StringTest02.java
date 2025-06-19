package academy.devdojo.maratonajava.QString.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String numeros = "012345";
        System.out.println(nome.charAt(0));//charAt pega a posição, EX: L = posicao 0
        System.out.println(nome.length()); //ve a quantidade de palavras
        System.out.println(nome.replace("f", "l")); //troca a palavra pela outra
        System.out.println(nome.toLowerCase());//minuscula
        System.out.println(nome.toUpperCase());//maiuscula
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,3));//vai do primeiro indice até a onde vc quer que ele va
        System.out.println(numeros.substring(3, numeros.length()));
        System.out.println(nome.trim());//remove valores em branco no começo até o fim
    }
}
