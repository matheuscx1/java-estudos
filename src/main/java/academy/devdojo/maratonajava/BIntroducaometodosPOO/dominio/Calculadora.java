package academy.devdojo.maratonajava.BIntroducaometodosPOO.dominio;

public class Calculadora {


    //public modificador  //void não retorna nada //somaDoisNumeros() é a função

    //parametros de função = o que a funcao precisa pra rodar
    public void somaDoisNumero(){
        System.out.println(10 + 10);

    }

    public  void subtraiDoisNumeros(){
        System.out.println(21 - 2);
    }
                                    //sintase correta
                                    //Parametros
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        return 0;// <- aqui é onde ele sempre retorna 0, não importa os parâmetros
        //Em todos os casos o que está escrito no corpo do método é:
        //“Ignore os números e só me devolva o número 0”.

        //Pra retornar o valor correto da divisão, você precisa usar a operação de divisão com os parâmetros recebidos:
        // return num1 / num2
    };

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if( num2 == 0){
            System.out.println("Não existe divisão por 0");
            // Importante: sai do método aqui!
        }
        System.out.println(num1/num2);// Já imprime o resultado direto aqui
    }

    // Dentro do método alteraDoisNumeros da Calculadora:
    public void alteraDoisNumeros(int num1, int num2){
        // Esses num1 e num2 AQUI são cópias dos valores que vieram lá do Test04
        // Ou seja, é como se o Java fizesse:
        // int num1 = 1; (cópia)
        // int num2 = 2; (cópia)

        num1 = 99;// muda só a cópia
        num2 = 33;// muda só a cópia

        // Isso só afeta o que tá acontecendo DENTRO desse método
        // Lá fora, os valores originais continuam intactos
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);

        //em Java, quando você passa variáveis primitivas (como int, double, etc.) para um método, você está passando uma cópia do valor, não o valor original diretamente.
    }
    //Desafio: Criar uma calculadora que valida se um numero é primo ou não
    // retornar true se for, false se não for

    //Desagio 2: criar uma calculadora que recebe uma lista ou array e retorna toda essa lista  x2
    // Se a entrada for [1,2,3] o retorno de [2, 4, 6]


    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

                                //precisa ser com os 3 pontos antes
                                //precisa ser o ultimo dentro dos parenteses
        public void somaVarArgs(int... numeros){
        int soma = 0;// Variável pra acumular a soma

            // Mesmo esquema de for-each: percorre cada número recebido
            for(int num : numeros){
            soma += num; // Soma o valor atual de 'num'
        }
        System.out.println(soma);// Mostra o resultado final da soma
        }




}

// método void vazio, não retorna nada, mas tem saida
// Multiplas palavras a primeira letra é maiuscula ex: fazIssoAqui
