package academy.devdojo.maratonajava.BIntroducaometodosPOO.dominio;

public class ImpressoraEstudante {
    //O próximo passo é imprimir os atributos do objeto Estudante de forma mais organizada. Para evitar ficar repetindo os mesmos comandos de System.out.println
    // você cria uma classe ImpressoraEstudante e um método imprime.

    //O método imprime recebe um objeto do tipo Estudante como parâmetro.
    // Esse objeto (que é uma instância da classe Estudante) vai ser referenciado dentro do método como estudante (ou seja, é o nome do parâmetro).


                                    //Esse estudante é o mydoria 15 'M' da classe EstudanteTest01
    public void imprime(Estudante estudante){
        //Aqui vc cria um método imprime do tipo Estudante, então vc pega os atributos do estudante, nome idade e sexo
        // e coloca na variavel estudante

        //Dentro do método, você acessa os atributos do objeto Estudante passando pelo parâmetro estudante e imprime os valores desses atributos:
        System.out.println("---------");
        System.out.println(estudante.nome); // Imprime o nome do estudante
        System.out.println(estudante.idade);// Imprime a idade do estudante
        System.out.println(estudante.sexo);// Imprime o sexo do estudante

    }
}
