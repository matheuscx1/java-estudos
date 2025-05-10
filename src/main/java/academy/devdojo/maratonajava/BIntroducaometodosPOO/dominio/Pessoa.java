package academy.devdojo.maratonajava.BIntroducaometodosPOO.dominio;

public class Pessoa {
    // -----------------------
    // 🧠 Atributos (Variáveis)
    // -----------------------
    // Esses atributos foram declarados como "private"
    // Isso significa que só podem ser acessados diretamente dentro da própria classe (Pessoa).
    // Faz parte do princípio de **encapsulamento**, que protege os dados da classe.

        private String nome;
        private int idade;

    // ----------------------------------
    // 📦 Método para imprimir os dados
    // ----------------------------------
        public void imprime(){
            // Usamos "this" para indicar que estamos acessando o atributo da própria classe

            System.out.println(this.nome);
            System.out.println(this.idade);
        }
    // ----------------------------------
    // ✅ Métodos SETTERS (modificar dados)
    // ----------------------------------
    // Sempre que quisermos *atribuir valores* a atributos privados, usamos setters.
    // Isso dá mais controle e segurança.

    public void setNome(String nome){
        // Usamos "this.nome" para diferenciar o atributo do parâmetro local
        this.nome = nome;
    }
                        //O que vc quer passar
    public void setIdade(int idade){
        // Aqui temos uma verificação para impedir idades inválidas

        if(idade <= 0){
            System.out.println("Idade negativa");
            return;// encerra a execução do método sem alterar o valor
        }
            this.idade = idade;// só chega aqui se a idade for válida
    }
    // ----------------------------------
    // ✅ Métodos GETTERS (ler dados)
    // ----------------------------------
    // Após definir os dados com set, podemos acessar os valores com get
    // Getters retornam o valor dos atributos privados


    //não precisa de void
    public String getNome(){
            return this.nome;
    }

    public int getIdade(){
            return this.idade;
    }


}

// 🗺️ MAPA COMPLETO - PESSOA.JAVA
// ------------------------------
// ✅ Conceitos de POO aplicados:
// - Encapsulamento → os atributos são privados e controlados por métodos públicos.
// - Métodos → setNome, getNome, setIdade, getIdade, imprime.
// - this → palavra-chave que referencia o objeto atual.
// - Validação → protegemos a integridade do atributo idade com verificação.

// ✅ Fluxo geral:
// - Atributos são definidos como privados.
// - Setters modificam os atributos (com validação).
// - Getters permitem acesso controlado aos valores.
// - Método imprime() mostra os dados formatados na tela (se chamado).
