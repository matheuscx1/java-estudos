package academy.devdojo.maratonajava.Oexception.exception.test;

import java.io.File;
import java.io.IOException;


//IO = entrada e saida
//
public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }
    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado" +isCriado);
        }catch(IOException e){//Nunca deixe o catch em branco
            e.printStackTrace();//printa a pilha de erros. Para ver oq tem de errado
        }
    }

}
