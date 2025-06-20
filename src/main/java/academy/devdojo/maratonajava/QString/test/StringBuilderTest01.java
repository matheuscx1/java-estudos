package academy.devdojo.maratonajava.QString.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat("Devdojo");//retorna uma nova string. Cria uma nova string na memoria
        nome.substring(0,3);
        System.out.println(nome);
        StringBuffer sb = new StringBuffer("William Suane");
        sb.append(" Devdojo").append(" Academy");//nao cria um novo, ele apenas adiciona
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
