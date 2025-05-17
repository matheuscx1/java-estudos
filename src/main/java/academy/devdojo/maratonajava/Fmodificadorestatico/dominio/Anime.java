package academy.devdojo.maratonajava.Fmodificadorestatico.dominio;

public class Anime {
    private String nome; // Instance variable: each Anime object will have its own 'nome'

    private static int[] episodios;
    // Static variable: shared by all Anime instances.
    // It's initialized only once, when the class is loaded.

    // 🔁 STATIC INITIALIZATION BLOCK
    // This block runs only ONCE when the class Anime is first loaded into memory.
    // It is used to initialize static variables.
    // This happens before any object is created or any static method is called.
    static {
        System.out.println("Dentro do bloco de inicializacao"); // Prints message once
        episodios = new int[100]; // Create an array of 100 episodes
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i + 1; // Fill it with values from 1 to 100
        }
    }

    // 🔧 Constructor 1: sets the instance's 'nome' value
    public Anime(String nome) {
        this.nome = nome;
    }

    // 🔧 Constructor 2: no name, but prints the static episodes
    public Anime(){
        // Since 'episodios' is static, we access it using the class name
        for(int episodio : Anime.episodios){
            System.out.println(episodio + " "); // Prints episode numbers
        }
    }

    // Getter for the 'nome' (instance-level)
    public String getNome() {
        return nome;
    }

    // Getter for 'episodios' (static, so shared across all objects)
    public int[] getEpisodios() {
        return episodios;
    }
}
