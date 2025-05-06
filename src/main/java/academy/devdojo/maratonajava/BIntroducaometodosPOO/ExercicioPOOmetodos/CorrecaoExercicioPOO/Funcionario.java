package academy.devdojo.maratonajava.BIntroducaometodosPOO.ExercicioPOOmetodos.CorrecaoExercicioPOO;

// 📦 CLASSE Funcionario
// 👉 Esta classe representa o modelo (domínio) de um funcionário
// 👉 Em POO, ela é uma classe que agrupa dados (nome, idade, salários) e comportamentos (métodos imprimir e mediaSalario)
// 👉 Ou seja: ela encapsula tanto estado (os dados) quanto comportamento (os métodos que agem nesses dados)

public class Funcionario {
    // 🔑 ATRIBUTOS (ou campos, ou variáveis de instância)
    // São as características do objeto (instância de Funcionario) quando ele for criado
    public String nome;
    public int idade;
    public double[] salarios;

    // ⚙️ MÉTODO imprimir()
    // Este método imprime os dados básicos do funcionário no console
    // Além disso, ele chama internamente outro método (mediaSalario) ao final
    public void imprimir() {
        // 👉 this.nome e this.idade referem-se ao nome e idade do OBJETO ATUAL
        // Exemplo: se você criou Funcionario funcionario = new Funcionario();
        // então aqui, this.nome = funcionario.nome, this.idade = funcionario.idade

        System.out.println(this.nome);
        System.out.println(this.idade);

        // ⚠️ CHECAGEM DE NULIDADE
        // Se o array salarios for null (não inicializado), interrompe aqui (return) e não tenta percorrer, evitando NullPointerException
        if (salarios == null) {
            return;                   // nao precisa abrir e fechar as chaves no if se tiver apenas 1 liha de execucao, mas as 3 linhas contam como uma, mas isso é feio então coloque os aprenteses, pra simplficar ainda mais e melhorar vc pode colocar assim:
        }

        // 🌀 FOR-ENHANCED (for-each) LOOP
        // Percorre cada elemento do array salarios
        // Para cada salario → imprime no console, seguido por um espaço
        for (double salario : this.salarios) {
            System.out.print(salario + " ");
        }
        // ✅ CHAMADA DO MÉTODO mediaSalario()
        // Colocado aqui para não precisar chamar lá no FuncionarioTest01
        mediaSalario();
    }


    // ⚙️ MÉTODO mediaSalario()
    // Calcula e imprime a média salarial do funcionário

    public void mediaSalario() {
        // ⚠️ CHECAGEM DE NULIDADE (de novo)
        // Mesmo que já tenha sido checado no imprimir(), fazemos outra checagem aqui
        // Por quê?
        // Porque este método é PUBLICO → pode ser chamado isoladamente de fora
        // Exemplo: funcionario.mediaSalario(); (sem passar pelo imprimir())
        if (salarios == null) {
            return;
        }

        // 🧮 CALCULAR A MÉDIA
        double media = 0;

        // Soma todos os salários
        for (double salario : this.salarios) {
            media += salario;
        }

        // Divide pelo número de salários (comprimento do array)
        media /= this.salarios.length;

        // 📢 Imprime o resultado
        System.out.println("\nMédia salarial: " + media);

    }
}

// 🗺️ MAPA COMPLETO DO FLUXO
// ✅ Quem cria quem:
// - A classe FuncionarioTest01 cria o objeto Funcionario.
// - Esse objeto armazena os dados e os métodos.
//
// ✅ Quem chama quem:
// - FuncionarioTest01.main() → chama funcionario.imprimir() → que chama mediaSalario().
//
// ✅ Como os dados fluem:
// - Os dados do array salarios são usados tanto no laço for (para imprimir) quanto no cálculo da média.
// - O método imprimir() é o ponto central, porque além de exibir, ele também dispara o cálculo da média.
//
// ✅ POO envolvido:
// - Instância → o objeto Funcionario criado no main.
// - Encapsulamento → aqui não está bem aplicado, porque os atributos estão public; o ideal seria usar private + getters/setters.
// - Método → funções da classe, como imprimir() e mediaSalario().
// - Array → estrutura de dados para armazenar múltiplos salários.
// - Responsabilidade → Funcionario cuida de seus próprios dados e cálculos; FuncionarioTest01 apenas cria e dispara ações.
//
// ✅ Analogia prática:
// Pense no Funcionario como uma ficha de cadastro que sabe mostrar seus dados e fazer contas sobre si mesma.
// O FuncionarioTest01 é como alguém testando essa ficha, preenchendo os campos e pedindo para a ficha se apresentar.

