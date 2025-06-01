package academy.devdojo.maratonajava.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    //static pertence a classe, não ao objeto
    public static final double VELOCIDADE_LIMITE;
    //Quando vc marca um primitivo como final, ele nunca pode ser mudado depois disso
    // Constantes static + final precisam usar capslock
    //se remover o static não vai funcionar, pois precisaria chamar o objeto Carro.

    static {
        VELOCIDADE_LIMITE = 250;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
