package academy.devdojo.maratonajava.Npolimorfismo.servico;

import academy.devdojo.maratonajava.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio  {


    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
