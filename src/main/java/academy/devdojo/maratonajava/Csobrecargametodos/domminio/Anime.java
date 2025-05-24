package academy.devdojo.maratonajava.Csobrecargametodos.domminio;

public class Anime {
    // 🔒 ATRIBUTO PRIVADO
    // Esse campo representa o tipo do anime (ex: "Shounen", "Comédia", etc)
    // Está como "private", ou seja, só pode ser acessado de dentro desta classe
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;


    public Anime(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", episodios=" + episodios +
                ", genero='" + genero + '\'' +
                '}';
    }


    // ⚙️ MÉTODO init() - SOBRECARGA 1
    // Este método serve para inicializar os valores de nome, tipo e episódios
    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    // ⚙️ MÉTODO init() - SOBRECARGA 2
    // Esta versão aceita um argumento a mais: gênero
    // Para reaproveitar o código, ela chama a outra init() usando this.init(...)
    public void init(String nome, String tipo, int episodios, String genero) {
       this.init(nome, tipo, episodios);
        this.genero = genero;
    }


    public void imprime(){
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
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

    // ⚙️ MÉTODO SETTER: setTipo
    // Esse método serve para **definir um valor para o atributo tipo**
    // Como o atributo é privado, você não pode fazer anime.tipo = "alguma coisa" diretamente de fora
    // Então usa-se esse método público como "porta de entrada controlada"

    public void setTipo(String tipo) {
        // 🧠 this.tipo → se refere ao atributo da classe (Anime)
        // 🧠 tipo → é o parâmetro que está sendo passado para o método
        // Quando os dois têm o mesmo nome, usamos "this." para dizer que queremos o atributo do objeto

        // Exemplo:
        // Anime anime = new Anime();
        // anime.setTipo("Shounen");
        // Aqui embaixo, o parâmetro tipo = "Shounen"
        // Então fazemos: this.tipo = "Shounen";
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
}

// 🗺️ MAPA DO FUNCIONAMENTO DESSA CLASSE:
//
// ✅ Objetivo:
// Representar um Anime com seus atributos básicos e permitir inicialização flexível.
//
// ✅ Quem chama quem:
// - AnimeTest01 cria o objeto → chama init() → chama imprime()
//
// ✅ POO aplicada:
// - Encapsulamento: os atributos são privados, acessados por métodos públicos.
// - Sobrecarga de métodos: dois init() com assinaturas diferentes.
// - Reuso de código: init() com 4 parâmetros reaproveita o de 3 via this.init(...)
// - Instância: tudo funciona sobre o objeto `anime` criado no teste.
//
// ✅ Analogia prática:
// Imagine uma ficha de anime que você pode preencher de uma vez com todos os dados
// ou preencher só os principais e depois adicionar o restante.
