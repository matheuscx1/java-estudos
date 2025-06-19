package academy.devdojo.maratonajava.QString.test;

public class StringTest01 {
    public static void main(String[] args) {
        //String são imutaveis
        String nome = "Matheus"; //String constant pool
        String nome2 = "Matheus";
        nome =  nome.concat(" Amorim"); //a original "Matheus" ainda esta na memoria, o contact cria a nova string na memoria
        System.out.println(nome);
        System.out.println(nome == nome2);//true
        String nome3 = new String ("Matheus");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());//intern acesse a pool de strings e se junta com ela
    }
}
