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
