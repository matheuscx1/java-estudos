package academy.devdojo.maratonajava.AintroducaoclassesPOO.ExerciciosPOO.Classes;

public class Carro {

   public String nome;
   public String modelo;
   public int ano;

   // Esse "public" aqui quer dizer:
   // "Essa classe Carro pode ser acessada por QUALQUER OUTRA CLASSE do seu projeto"
   // Se não tivesse "public", ela só poderia ser acessada por outras classes do mesmo pacote (pacote = pasta)

   // Esses "public" nos atributos também significam:
   // "Qualquer classe pode acessar e modificar esses atributos diretamente"
   //
   // Exemplo:
   // Carro carro = new Carro();
   // carro.nome = "Uno"; // isso só é possível porque 'nome' é public


   // Essa é uma classe chamada Carro
   // Ela é um "molde" (ou blueprint) que define o que um carro tem

   // Atributos (ou propriedades) do carro:


   /*
    public String nome;  // Ex: "Uno", "Mustang"...
   public String modelo; // Ex: "Mille", "GT"...
   public int ano; // Ex: 2008, 2018...
    */
   
   // Esses atributos representam o "estado" do carro
   // Toda vez que você cria um novo Carro (com `new Carro()`),
   // um novo objeto com esses atributos vazios será criado na memória
}
