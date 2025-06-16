package academy.devdojo.maratonajava.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();//tenta criar novo arquivo
            System.out.println("Arquivo criado" +isCriado);
        }catch(IOException e){//Se der errado, rejogue novamente o erro para o método main, para que o main deixe para a JVM
            e.printStackTrace();//registra o erro
            throw e;
        }
    }
}
