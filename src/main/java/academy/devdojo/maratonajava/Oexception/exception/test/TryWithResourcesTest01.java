package academy.devdojo.maratonajava.Oexception.exception.test;

import academy.devdojo.maratonajava.Oexception.exception.dominio.Leitor1;
import academy.devdojo.maratonajava.Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
    lerArquivo();
    }

    //Eles são chamados na ordem inversa
    public static void lerArquivo(){
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){
        }catch (IOException e){

        }
    }
    public static void lerArquivo2(){
        Reader reader = null; //declara variavel
        try {//tente criar um BufferedReader que envolve FileReader
            reader = new BufferedReader(new FileReader("teste.txt"));//FileReader tenta abrir teste.txt
        } catch (FileNotFoundException e) {//Se não existir jogue um erro, Se existir guarde no reader
            e.printStackTrace();//printa o erro
        }finally {//Executa independente de qualquer coisa
            try{
             if(reader != null){//Se reader for criado com sucesso -> feche, se não, pule
                 reader.close();
             }
            }catch (IOException exception){
                exception.printStackTrace();//Jogue uma exception caso de algum erro
            }
        }
    }
}
