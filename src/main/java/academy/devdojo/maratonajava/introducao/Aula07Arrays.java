package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays {
    public static void main(String[] args) {
        //entidade do tipo reference, esta fazendo referencia ao um objeto em memoria que tem 3 espaços
        int[] idades = new int[3];

        System.out.println(idades);
    }
}
//Arrays começam em 0
//[0] [1] [2] Array de 3 posicoes, com indice começando em 0
// Ou sej, se tentar acessar a posicao [3] dará erro, pois o indice só vai ate 2