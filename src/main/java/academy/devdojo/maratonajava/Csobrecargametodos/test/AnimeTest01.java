package academy.devdojo.maratonajava.Csobrecargametodos.test;

import academy.devdojo.maratonajava.Csobrecargametodos.domminio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Biriri", "Tv", 12, "Romance");
        anime.imprime();
    }
}
