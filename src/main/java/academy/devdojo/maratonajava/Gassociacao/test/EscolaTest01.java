package academy.devdojo.maratonajava.Gassociacao.test;

import academy.devdojo.maratonajava.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor[] professores = {professor};
        Escola escola = new Escola("Konoha", professores);
        escola.imprime();

    }
}
