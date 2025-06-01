package academy.devdojo.maratonajava.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE;
    //Quando vc marca um primitivo como final, ele nunca pode ser mudado depois disso

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
