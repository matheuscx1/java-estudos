package academy.devdojo.maratonajava.Gassociacao.test;

import academy.devdojo.maratonajava.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor professor2 = new Professor("Paçoca");
        Professor professor3 = new Professor("Maria");

        Professor[] professores = {professor, professor2, professor3};

        Escola escola = new Escola("Konoha");
        //A lista de  professores virá de fomra externa
        //Simulando chamada...Recebemos a lista de professores

        escola.setProfessores(professores);
        escola.imprime();



    }
}
