package academy.devdojo.maratonajava.Npolimorfismo.servico;

import academy.devdojo.maratonajava.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
