package academy.devdojo.maratonajava.BIntroducaometodosPOO.test;

import academy.devdojo.maratonajava.BIntroducaometodosPOO.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        // Criamos uma instância da classe Pessoa, chamada "pessoa"
        // Essa instância tem seus próprios atributos nome e idade


        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Luffy");
        // Usamos o setter para atribuir o nome

        // Usamos o setter para definir a idade (com validação dentro da classe)
        pessoa.setIdade(18);

        // Usamos os getters para recuperar os valores
        // Esses dados vêm dos atributos privados, acessados de forma segura        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());





    }
}

// 🗺️ MAPA COMPLETO - PESSOATEST01.JAVA
// ------------------------------------
// ✅ O que acontece aqui:
// - Instanciamos (criamos) um objeto da classe Pessoa.
// - Usamos os métodos setNome e setIdade para atribuir dados ao objeto.
// - Depois usamos os métodos getNome e getIdade para recuperar e exibir esses dados.

// ✅ Conceitos aplicados:
// - Instância de classe (objeto pessoa).
// - Chamada de métodos públicos (set/get).
// - Boa prática: não acessamos os atributos diretamente, mas sim através de métodos.
// - Comunicação entre classes: a classe PessoaTest01 acessa a lógica contida na classe Pessoa, usando seus métodos públicos.

// ✅ Resumo prático:
// - Isso é uma simulação real de encapsulamento de dados.
// - Ideal quando queremos proteger as informações de um objeto e manipular só de forma controlada.
// - Esse tipo de estrutura é usada em sistemas reais (bancos, cadastros, etc.).
