package academy.devdojo.maratonajava.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;



    // ⚙️ CONSTRUTOR
    // O construtor é chamado automaticamente quando você cria um objeto com `new Anime(...)`
    // Ele tem o mesmo nome da classe e não tem tipo de retorno

    // 🧱 CONSTRUTOR 1: com 4 parâmetros (nome, tipo, episódios, gênero)
    // Esse construtor é chamado quando criamos o objeto com 4 argumentos
    public Anime(String nome, String tipo, int episodios, String genero) {
        this(); // Isso imprime "dentro do construtor sem argumentos"

        // 🛠️ Depois que o construtor vazio termina, continuamos aqui
        // Atribuímos os valores recebidos nos atributos do objeto
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;

        // Agora esse construtor termina e volta para quem chamou (talvez o construtor com 5 argumentos)

    }

    //sobrecarga de metodos no construtor

    // 🧱 CONSTRUTOR 2: com 5 parâmetros (nome, tipo, episódios, gênero, estudio)
    public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
        // 👉 Primeiro, chamamos o outro construtor acima com 4 argumentos
        // Isso vai automaticamente executar o `this()` também, então a ordem será:
        // 1. this() → imprime "dentro do construtor sem argumentos"
        // 2. Atribui nome, tipo, episódios, gênero
        this(nome, tipo, episodios, genero); //java vai achar o construtor baseado no tipo

        // 🛠️ Depois que o outro construtor termina, aqui atribuimos o estudio
        this.estudio = estudio;

        // ✅ Agora o objeto está completamente pronto

    }


    // 🧱 CONSTRUTOR 3: sem argumentos (chamado internamente pelos outros)
    public Anime() {
        System.out.println("dentro do construtor sem argumentos ");
    }

    public void imprime(){
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return episodios;
    }

    // 🗺️ MAPA DA CLASSE:
//
// ✅ Objetivo:
// - Criar objetos `Anime` já com todos os atributos definidos assim que são instanciados.
// - Imprimir esses atributos com `imprime()`
//
// ✅ POO aplicada:
// - Encapsulamento: atributos privados, acessados via getters/setters
// - Construtor: método especial executado automaticamente ao criar o objeto
// - Instância: tudo funciona com base em um objeto `anime` específico
//
// ✅ Exemplo prático:
// - Quando você cria um anime com `new Anime(...)`, ele já nasce com nome, tipo, episódios e gênero.
// - Ideal quando esses valores são obrigatórios desde o começo.
}
