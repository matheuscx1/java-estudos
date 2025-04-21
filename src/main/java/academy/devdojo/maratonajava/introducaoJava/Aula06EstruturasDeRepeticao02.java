package academy.devdojo.maratonajava.introducaoJava;
//Imprima os primeiros 25 numeros de um dado valor. Por exemplo, 50
public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        int valorMax = 50;

        for (int i = 0; i < valorMax; i++) {
            if(i>25){ //O brake faz voce sair do laço
                break;
            }
            System.out.println(i);
        }
    }

}
