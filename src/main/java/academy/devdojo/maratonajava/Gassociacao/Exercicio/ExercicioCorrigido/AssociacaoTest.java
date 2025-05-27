package academy.devdojo.maratonajava.Gassociacao.Exercicio.ExercicioCorrigido;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua goiaba");
        Aluno aluno = new Aluno("birituba", 15);
        Professor professor = new Professor("Barba negra", "pirata");
        Aluno[] alunosSeminarios = {aluno};
        Seminario seminario = new Seminario("Feliz", alunosSeminarios, local);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }
}
