package academy.devdojo.maratonajava.introducaoJava;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        //While precisa ser booleano
        int count = 0;
        while(count <=10 ){ // Enquanto count for menor que 10, continue contando
            System.out.println(count);//Vai entrar num loop voltando para o inicio
                                        // até atingir o numero desejado
             count++;                   //Troque o estado da variavel no scopo do while
        }

        count = 0;
        do {
            System.out.println("dentro do-while " + ++count);
        }while (count <10);

        //For tem 3 partes. Use for para percorrer listas
        //Primeira parte = cria a variavel
        //Segunda parte = faça a comparação até aonde vc quer que o laço de rep seja exeutado
        //Terceira parte = Como essa variavel vai alterar o status

        //Para i começando de 0, até i for menor que 10, incremente 1
        for (int i=0; i <10; i++){
            System.out.println("For " +i);

        }
    }
}
