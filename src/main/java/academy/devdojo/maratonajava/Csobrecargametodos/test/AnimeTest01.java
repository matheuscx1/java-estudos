package academy.devdojo.maratonajava.Csobrecargametodos.test;

import academy.devdojo.maratonajava.Csobrecargametodos.domminio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Kakashi", "Ninja");
        anime.init("Biriri", "Tv", 12, "Romance");
        System.out.println(anime.toString());
        anime.imprime();

    }
}
