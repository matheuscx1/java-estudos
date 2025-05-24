package academy.devdojo.maratonajava.Gassociacao.dominio;

public class Jogador {
    private String nome; // This variable holds the name of the player (e.g., "Neymar")
    private Time time; // This variable is a reference to a Time object — the team this player belongs to

    // Constructor: when we create a new Jogador, we must pass a name
    public Jogador(String nome) {
        this.nome = nome;
    }
    public void imprime(){
        // Print the player's name
        System.out.println(this.nome);

        // If this player has a team associated (not null), print the team name
        if(time != null){
            System.out.println(time.getNome());
        }
    }

    // Getter: returns the team this player is associated with
    public Time getTime() {
        return time;
    }

    // Setter: this is how we associate a Time object with this Jogador
    public void setTime(Time time) {
        this.time = time;  // ⚠️ Only the player knows the team. The team doesn’t get any information about the player.
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
