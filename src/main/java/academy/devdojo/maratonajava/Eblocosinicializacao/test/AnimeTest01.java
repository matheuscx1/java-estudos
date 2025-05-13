package academy.devdojo.maratonajava.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        // 🔸 Aqui você está criando um objeto Anime usando o construtor que recebe nome

        Anime anime = new Anime("Juriri");
        // 🔸 Ao criar o objeto, o bloco de inicialização roda e preenche o array de episódios

        // 🔸 Agora, você percorre esse array e imprime os episódios
        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio + " ");
        }

    }
}
