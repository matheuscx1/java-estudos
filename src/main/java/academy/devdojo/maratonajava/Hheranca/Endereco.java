package academy.devdojo.maratonajava.Hheranca;

public class Endereco {
    private String rua;
    private String cep;

    public void imprime(){
    Pessoa p = new Pessoa();
    p.nome = "biri";
    }

    public Endereco(String rua, String cep) {
        this.rua = rua;
        this.cep = cep;
    }

    public Endereco() {

    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
