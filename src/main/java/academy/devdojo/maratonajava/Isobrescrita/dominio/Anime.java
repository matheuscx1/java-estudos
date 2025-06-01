package academy.devdojo.maratonajava.Isobrescrita.dominio;

public class Anime {
    private String nome;
    //toString() em java é usado para fornecer uma representação de um objeto, por padrão vem um hascode, sobrescrever com tostring permite customizar a representacao, dando mais informacoes sobre o objeto
    //os padroes precisam ser o mesmo, o modificador de acesso tem que ser o menos restritivo

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
