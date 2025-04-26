package academy.devdojo.maratonajava.BIntroducaometodosPOO.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;


    // Método imprime que vai imprimir os dados do próprio objeto
    public void imprime(){
        System.out.println("---------------------");

        System.out.println(this.nome); // this.nome significa "o nome deste objeto Estudante que chamou o método"
        System.out.println(this.idade); // this.idade é "a idade deste objeto Estudante"
        System.out.println(this.sexo);  // this.sexo é "o sexo deste objeto Estudante"
    }

}
