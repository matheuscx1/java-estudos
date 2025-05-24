package academy.devdojo.maratonajava.Gassociacao.test;

import academy.devdojo.maratonajava.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("David");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);


        System.out.println("-----Jogadores-----");
        jogador.imprime();
        System.out.println("-----Time-----");
        time.imprime();
    }
}
