package academy.devdojo.maratonajava.introducaoJava;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria junevil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 17;
        String categoria;

        if(idade < 15){
            categoria = "Categoria infantil";
        }else if(idade >= 15 ){
            categoria = "Categoria juvenil";
        }else{
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);

        //Quando usar if separado e if-else?
        // Use if separado quando as condições são independentes (ou seja, mais de uma pode ser true ao mesmo tempo).
        // Use if-else quando as condições são mutuamente exclusivas (ou seja, só um bloco pode ser verdadeiro por vez).



    }
}
