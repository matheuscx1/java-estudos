package academy.devdojo.maratonajava.Gassociacao.test;

import academy.devdojo.maratonajava.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        // Creating a player object and giving it a name
        Jogador jogador1 = new Jogador("Neymar");

        // Creating a team object and giving it a name
        Time time = new Time("Seleção brasileira");


        // Associate the team with the player
        jogador1.setTime(time);  // ✅ Now jogador1 knows which team he belongs to

        // Print player info
        jogador1.imprime();

        // ❌ But the team does NOT know who Neymar is.
        //Time has no list or variable pointing back to the player.
    }
}
