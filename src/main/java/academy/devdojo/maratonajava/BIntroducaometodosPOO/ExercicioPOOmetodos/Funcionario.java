package academy.devdojo.maratonajava.BIntroducaometodosPOO.ExercicioPOOmetodos;


// Classe = um modelo/estrutura que descreve como deve ser um objeto do tipo Funcionario.
// Faz parte da Programação Orientada a Objetos (POO): usamos classes para modelar coisas do mundo real.
public class Funcionario {
    // Variáveis (ou atributos) = características do objeto.
    // Aqui estamos dizendo que cada Funcionario terá nome, idade e três salários.
   String nome;
   int idade;
   double salario;
   double salario2;
   double salario3;


    // Método = uma ação/comportamento que a classe pode executar.
    // Aqui criamos um método que calcula a média dos três salários.
   double calcularMedia(){
       // soma os três salários e divide por 3 para obter a média
       // usamos parênteses para garantir que a soma aconteça antes da divisão
       return (salario + salario2 + salario3) / 3;
   }
    // OBS: entender a ordem de precedência (parênteses são usados para garantir a ordem correta dos cálculos)
    // Importante: este método está ligado à própria classe Funcionario, ou seja, ele depende dos dados do objeto.
    // Isso é encapsulamento: o cálculo da média está "dentro" do objeto e não fora.
}


