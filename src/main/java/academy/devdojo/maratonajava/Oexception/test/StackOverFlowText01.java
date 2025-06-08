package academy.devdojo.maratonajava.Oexception.test;

public class StackOverFlowText01 {
    //recursividade() chama recursividade()
    //A cada chamada, o método é empilhado no call stack

    public static void main(String[] args) {
        recursividade();
    }

    //Essa função esta se chamando, sem nenhum limite
    //Isso se chama recursão sem condição de parada(infinite recursion)
    public static void recursividade(){
        recursividade();
    }
}
