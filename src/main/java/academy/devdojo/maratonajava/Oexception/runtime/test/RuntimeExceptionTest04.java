package academy.devdojo.maratonajava.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

//Excecoes genericas precisam vir no final
public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (RuntimeException e){//mais generica
            System.out.println("Dentro do RuntimeException");
        }


        try{
            talvezLanceException();
        }catch (IOException | SQLException  e){
            e.printStackTrace();
        }
    }

    //nao fazem parte da mesma linha de herança
    //Deixa em caso de precisar no futuro
    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
