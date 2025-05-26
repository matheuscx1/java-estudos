package academy.devdojo.maratonajava.Gassociacao.Exercicio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;


    public void imprime(){
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if(this.seminarios == null)return;
        for(Seminario seminario : this.seminarios){
           seminario.imprime();
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
