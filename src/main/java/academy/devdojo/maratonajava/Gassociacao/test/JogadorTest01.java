package academy.devdojo.maratonajava.Gassociacao.test;

import academy.devdojo.maratonajava.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Pelé");
        Jogador jogador3 = new Jogador("Romario");
        Jogador[] jogadores = { jogador1, jogador2, jogador3 };
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
