package academy.devdojo.maratonajava.Gassociacao.Exercicio;

/*
Crie um sistema que gerencie seminários
O sitema deverá cadastrar seminários, estudantes, professores e local onde será realizado
Um aluno poderá estar em apenas um seminário
Um seminário poderá ter nenhum ou vários alunos
Um professor poderá ter vários seminários
Um seminário deve ter um local
Campos básicos (excluindo relacionamento) seminário: título
aluno: nome e idade
professor: nome, especialidade
local: endereço
 */

public class Seminario {
    private String nome;
    private Local local;
    private Aluno[] alunos;
    private Professor professor;

    public void imprime() {
        System.out.println(" Seminario: " + this.nome);

        if (this.local != null) {
            System.out.println(" Local: " + this.local);

        }
        if (this.professor != null) {
            System.out.println("Professor " + this.professor.getNome());
        }

        if (this.alunos != null) {
            for (Aluno aluno : this.alunos) {
                System.out.println("Alunos");
                aluno.imprime();
            }
        }
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
