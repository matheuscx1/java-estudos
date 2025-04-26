package academy.devdojo.maratonajava.BIntroducaometodosPOO.test;

import academy.devdojo.maratonajava.BIntroducaometodosPOO.dominio.Estudante;
import academy.devdojo.maratonajava.BIntroducaometodosPOO.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();//Começa instanciando a classe estudante1, pegando os atributos dela
        //Você começa criando objetos do tipo Estudante. A classe Estudante tem atributos como nome, idade e sexo. Ao criar uma instância da classe Estudante, você cria um objeto que vai ter esses atributos.
        //Neste momento, o objeto estudante1 é uma instância da classe Estudante, mas ele ainda não tem valores atribuídos aos atributos nome, idade e sexo. Você faz isso depois, atribuindo valores a esses atributos:

        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        //você já tem os objetos estudante1 e estudante2 com os dados preenchidos, e você quer imprimir as informações desses estudantes.
        //Para isso, você cria uma instância de ImpressoraEstudante e chama o método imprime, passando os objetos estudante1 e estudante2 como argumentos:


        //Agora, o objeto estudante1 tem seus atributos preenchidos com esses valores.
        //Você faz o mesmo para o segundo estudante1:
        estudante1.nome = "Midorya";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        estudante2.nome = "Tiriri";
        estudante2.idade = 13;
        estudante2.sexo = 'F';


        //Chama o método imprime, passando como parâmetro a referência do objeto estudante1.
        // Esse método, definido na classe ImpressoraEstudante, acessa os dados desse objeto e imprime no console.
        impressora.imprime(estudante1);
        impressora.imprime(estudante2);


        //Aqui está o resumo:
        //Quando você chama o método imprime(estudante1) em EstudanteTest01, você está passando a referência para o objeto estudante1 (no caso, o objeto com os dados "Midorya", 15, 'M').
        //Dentro do método imprime, a variável estudante1 (minúsculo) não cria um novo objeto, mas recebe uma cópia da referência para o mesmo objeto que foi passado de EstudanteTest01. Então, os dados de "Midorya", 15, 'M' continuam acessíveis, e o método apenas "exibe" esses dados.
        //Por que "cópia da referência"? Porque você não está criando um novo objeto, mas passando a "localização" do objeto já criado, e o método imprime pode acessá-lo e usá-lo, mas sem fazer uma cópia independente dos dados.

    }
}
