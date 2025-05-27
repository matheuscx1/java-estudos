package academy.devdojo.maratonajava.Gassociacao.test;

import academy.devdojo.maratonajava.Gassociacao.Exercicio.ExercicioCorrigido.Aluno;
import academy.devdojo.maratonajava.Gassociacao.Exercicio.ExercicioCorrigido.Seminario;

import java.util.Arrays;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Matheus", 15);
        Seminario seminario = new Seminario("Software Engineering");
        Seminario seminario2 = new Seminario("Software Engineering 2");
        Seminario[] seminarios = {seminario, seminario2};
        aluno.setSeminario(seminarios);
        System.out.println(Arrays.toString(aluno.getSeminario()));

    }
}
