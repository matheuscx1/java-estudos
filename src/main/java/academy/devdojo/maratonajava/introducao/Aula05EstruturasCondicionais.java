package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade > 18;
        //!
        if(idade >= 18){
            System.out.println("Autorizado");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não Autorizado");

        }
        boolean c = false;
        if(c = true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        System.out.println("Fora do if");
    }
}
