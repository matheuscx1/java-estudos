package academy.devdojo.maratonajava.BIntroducaometodosPOO.ExercicioPOOmetodos.CorrecaoExercicioPOO;


// 📦 CLASSE FuncionarioTest01
// 👉 Classe de teste → serve apenas para rodar e verificar se a lógica do Funcionario funciona corretamente
// Em POO, muitas vezes chamamos isso de classe de "test" ou "driver"

public class FuncionarioTest01 {
    public static void main(String[] args) {
        // 🛠️ CRIAÇÃO DA INSTÂNCIA
        // Aqui criamos um objeto real do tipo Funcionario, chamado "funcionario"
    Funcionario funcionario = new Funcionario();

        // 🏷️ ATRIBUIÇÃO DE VALORES
        // Preenchendo os atributos com dados fictícios (simulando um caso real)
    funcionario.setNome("sanji");
    funcionario.setIdade(23);
    funcionario.setSalarios(new double[]{1500, 987.65, 3000});
        System.out.println(funcionario.getMedia());

        // ⚙️ CHAMADA DO MÉTODO imprimir()
        // Isso vai rodar o método imprimir do Funcionario, que:
        // 1️⃣ imprime nome e idade
        // 2️⃣ imprime cada salário
        // 3️⃣ calcula e imprime a média salarial
    funcionario.imprimir();
    }
}

// 🗺️ MAPA COMPLETO DO FLUXO (documentação geral no final)
// --------------------------------------------
// ✅ O que cada classe faz:
// - Funcionario → guarda os dados (nome, idade, salários) e tem métodos para imprimir e calcular média.
// - FuncionarioTest01 → cria um objeto Funcionario, preenche os dados e aciona o processo.

// ✅ Quem instancia quem:
// - Aqui no main() → instanciamos (criamos) um objeto funcionario.
// - Chamamos funcionario.imprimir() → isso usa os métodos definidos dentro da classe Funcionario.

// ✅ O que acontece no método imprimir():
// - Imprime os atributos nome e idade.
// - Percorre o array salarios e imprime cada valor.
// - Chama internamente o método mediaSalario() → calcula e imprime a média salarial.

// ✅ Conceitos de POO aqui:
// - Classe → molde para criar objetos (Funcionario).
// - Objeto (instância) → funcionario criado no main.
// - Método → funções dentro da classe (imprimir, mediaSalario).
// - Encapsulamento (parcial) → estamos acessando atributos diretamente, mas boas práticas sugerem usar private + getters/setters.
// - Arrays → estrutura para armazenar múltiplos salários.

// ✅ Analogia prática:
// Pense que você está preenchendo uma ficha de funcionário no sistema (FuncionarioTest01).
// Quando você manda imprimir(), a ficha automaticamente lê seus próprios dados e ainda calcula a média dos salários para exibir.
// Você não precisa fazer isso manualmente no testador; a própria classe sabe como lidar com seus dados (princípio básico de encapsulamento e responsabilidade).

// ✅ Melhorias possíveis:
// - Tornar os atributos privados para garantir encapsulamento real.
// - Usar getters/setters para acessar/modificar dados.
// - Fazer verificações mais robustas (ex: se o array de salários estiver vazio ou nulo).
