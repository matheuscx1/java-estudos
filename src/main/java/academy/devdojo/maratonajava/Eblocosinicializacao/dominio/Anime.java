package academy.devdojo.maratonajava.Eblocosinicializacao.dominio;

public class Anime {
    // 🔒 Atributos privados: nome do anime e lista de episódios
    private String nome;
    private int[] episodios;

    // 🚀 ORDEM DE EXECUÇÃO QUANDO UM OBJETO É CRIADO:
    // 1️⃣ Aloca espaço na memória para o novo objeto
    // 2️⃣ Inicializa os atributos com valores padrão (ex: nome = null, episodios = null)
    // 3️⃣ Executa blocos de inicialização NÃO ESTÁTICOS (na ordem em que aparecem)
    // 4️⃣ Executa o construtor correspondente (conforme os argumentos)

    // 🔁 BLOCO DE INICIALIZAÇÃO NÃO ESTÁTICO
    // Este bloco será executado **toda vez que um objeto for criado**
    // Ele roda ANTES do construtor

    {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;

        }
    }

    // 🧱 CONSTRUTOR 1: recebe só o nome
    public Anime(String nome) {
        // Aqui só atribui o nome. Não inicializa o array de episódios.
        this.nome = nome;
    }

    // 🧱 CONSTRUTOR 2: sem argumentos
    // Esse construtor cria um array com 100 episódios numerados de 1 a 100
    public Anime(){
        for(int episodio : this.episodios){
            System.out.println(episodio + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
