package academy.devdojo.maratonajava.Gassociacao.dominio;

public class Time {
    private String nome; // This holds the name of the team (e.g., "Seleção brasileira")

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    // ⚠️ This class does NOT contain a list or array of players.
    //     It has no idea who its players are.
    //     It just holds the name of the team.
}
