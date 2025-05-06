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
    funcionario.nome = "sanji";
    funcionario.idade = 23;
    funcionario.salarios =  new double[]{1500, 987.65, 3000};

        // ⚙️ CHAMADA DO MÉTODO imprimir()
        // Isso vai rodar o método imprimir do Funcionario, que:
        // 1️⃣ imprime nome e idade
        // 2️⃣ imprime cada salário
        // 3️⃣ calcula e imprime a média salarial
    funcionario.imprimir();
    }
}

// 🗺️ MAPA COMPLETO DO FLUXO
// ✅ Quem cria quem:
// - Aqui criamos um objeto funcionario do tipo Funcionario.
// - Esse objeto é uma instância da classe Funcionario.
//
// ✅ Quem chama quem:
// - main() → cria funcionario → chama funcionario.imprimir().
// - imprimir() dentro do Funcionario → chama mediaSalario() internamente.
//
// ✅ Como os dados fluem:
// - Preenchemos os atributos (nome, idade, salarios) diretamente no objeto funcionario.
// - Ao chamar imprimir(), ele mostra os dados e calcula a média.
//
// ✅ POO envolvido:
// - Instância → o objeto funcionario criado.
// - Encapsulamento (não ideal aqui porque os atributos são public).
// - Método → chamamos um método da instância (imprimir()), que por sua vez chama outro método (mediaSalario()).
// - Array → usado para armazenar múltiplos salários no atributo salarios.
//
// ✅ Analogia prática:
// Pense no FuncionarioTest01 como o programador testando uma ficha de funcionário: ele cria, preenche e pede para a ficha se exibir e fazer contas sobre si mesma.
