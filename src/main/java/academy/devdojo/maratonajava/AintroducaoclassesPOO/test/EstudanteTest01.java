package academy.devdojo.maratonajava.AintroducaoclassesPOO.test;

import academy.devdojo.maratonajava.AintroducaoclassesPOO.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "luffy";
        estudante.idade = 15;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
