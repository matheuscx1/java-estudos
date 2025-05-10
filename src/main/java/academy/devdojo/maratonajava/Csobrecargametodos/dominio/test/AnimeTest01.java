package academy.devdojo.maratonajava.Csobrecargametodos.dominio.test;

import academy.devdojo.maratonajava.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Biriri", "Tv", 12, "Romance");
        anime.imprime();
    }
}
