package academy.devdojo.maratonajava.BIntroducaometodosPOO.ExercicioPOOmetodos;


public class FuncionarioTest01 {

    // Método main = ponto de entrada do programa.
    // Aqui criamos os objetos e coordenamos a execução.
    public static void main(String[] args) {

        // Criando (instanciando) um objeto Funcionario.
        // Instância = uma cópia real da classe na memória, com seus próprios dados.
        Funcionario funcionario = new Funcionario();

        // Criando (instanciando) um objeto ImpressoraFuncionario para poder usar seu método imprime.
        ImpressoraFuncionario imp = new ImpressoraFuncionario();

        funcionario.nome = "Joao";
        funcionario.idade = 25;
        funcionario.salario =3250;
        funcionario.salario2 =4900;
        funcionario.salario3 =5230;


        // Aqui chamamos o método imprime da ImpressoraFuncionario, passando nosso objeto Funcionario.
        // Isso conecta as classes: uma está usando os dados da outra.
        imp.imprime(funcionario);

        // calcula e imprime a média salarial usando o método calcularMedia da própria classe Funcionario
        System.out.println("Media de salarios: " + funcionario.calcularMedia());
        // aqui usamos o método que está DENTRO da própria classe Funcionario para fazer um cálculo


        // Conceitos aplicados:
        // - POO (Programação Orientada a Objetos): organizamos o código em classes e objetos.
        // - Encapsulamento: o cálculo está dentro do objeto Funcionario.
        // - Método: uma ação que a classe executa.
        // - Instância: o objeto real criado a partir da classe.
        // - Variável (atributo): os dados armazenados no objeto.

    }
}
