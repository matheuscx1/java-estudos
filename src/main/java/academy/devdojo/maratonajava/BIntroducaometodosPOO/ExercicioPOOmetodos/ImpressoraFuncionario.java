package academy.devdojo.maratonajava.BIntroducaometodosPOO.ExercicioPOOmetodos;

// Esta classe tem uma única responsabilidade: exibir (imprimir) os dados do Funcionario.
// Isso é uma boa prática chamada separação de responsabilidades: cada classe tem um papel claro.
public class ImpressoraFuncionario {
    public void imprime(Funcionario funcionario) {
        // Aqui estamos usando o objeto recebido para acessar seus atributos.

        System.out.println(funcionario.nome);
        System.out.println(funcionario.idade);
        System.out.println(funcionario.salario);
        System.out.println(funcionario.salario2);
        System.out.println(funcionario.salario3);

        // Conceito importante: estamos acessando diretamente os atributos.
        // Em um código mais avançado, usaríamos getters (métodos que retornam os valores).
        // Isso faz parte de encapsulamento: proteger os dados e expor só o necessário.
    }

}
