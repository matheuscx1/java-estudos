package academy.devdojo.maratonajava.Dconstrutores.test;


import academy.devdojo.maratonajava.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        // 👤 Cria um novo objeto Anime com todos os dados exigidos pelo construtor
        // O construtor será executado automaticamente ao usar new Anime(...)
        Anime anime = new Anime("Biriri", "TV", 12, "Romance", "piratex");
        //anime.init("Biriri", "Tv", 12, "Romance");
        // 💡 Antigamente usávamos: anime.init(...), agora isso é feito direto no construtor
        anime.imprime();
    }

// 🗺️ MAPA DO TESTE:
//
// ✅ Objetivo:
// Criar um anime e testar se o construtor está funcionando corretamente
//
// ✅ Diferença do módulo anterior:
// - Antes usávamos um método init para inicializar os dados (poderia esquecer de chamar).
// - Agora, ao criar o objeto, os dados obrigatórios já são preenchidos direto no construtor.
//
// ✅ Resultado no console:
// - Primeiro imprime "dentro do construtor"
// - Depois imprime os dados do anime
}
