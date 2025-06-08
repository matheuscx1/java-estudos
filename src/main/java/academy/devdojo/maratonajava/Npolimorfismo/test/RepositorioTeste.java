package academy.devdojo.maratonajava.Npolimorfismo.test;

import academy.devdojo.maratonajava.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.Npolimorfismo.servico.RepositorioArquivo;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        //repositorio é uma variavel de referencia do tipo Repositorio, e recebe um objeto de RepositorioArquivo
        //Repositorio é a interface
        //Estamos usando uma referencia do tipo Repositorio que aponta para o objeto RepositorioArquivo
        //Repositorio -> tipo de referencia
        //repositorio -> variavel da referencia(a ponta para o objeto em memoria)
        //new RepositorioArquivo() é o objeto atual sendo criado, a instancia da memoria
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}

//repositorio é a variavel de referencia do tipo Repositorio(interface)
//repositorio aponta para RepositorioArquivo, que inclue o método salvar()

//Repositorio (interface) defines um metodo salvar()
//RepositorioArquivo, RepositorioMemoria e RepositorioBancoDeDados implementam a interface, mas em diferentes maneiras
