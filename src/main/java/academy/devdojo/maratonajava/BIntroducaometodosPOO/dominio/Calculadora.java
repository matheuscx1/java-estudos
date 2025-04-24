package academy.devdojo.maratonajava.BIntroducaometodosPOO.dominio;

public class Calculadora {
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
        //
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

}

// método void vazio, não retorna nada, mas tem saida
// Multiplas palavras a primeira letra é maiuscula ex: fazIssoAqui
