package academy.devdojo.maratonajava.Exercicios;


//Dado um valor de um carro descubra quantas vezes ele pode ser parcelado
//Condição valorParcela >= 1000
public class Exercicio04LacosDeRepeticao {// Não misture double com it, para nao dar interferencia
    public static void main(String[] args) {
     double valorDoCarro = 30000;
        for (int parcela = 1; parcela <= valorDoCarro; parcela++) {
            double valorParcela = valorDoCarro / parcela;
            if (valorParcela >= 1000){
                System.out.println("Parcela "+ parcela + "R$ " + valorParcela);
            }
        }

    }
}

/*
Como funcionou esse fluxo:
Primeira iteração:

O laço começa com parcela = 1.
Calcula o valor da parcela: valorParcela = 30.000 / 1 = 30.000.
O if verifica se o valor da parcela é maior ou igual a 1.000.
No caso, é (30.000 >= 1.000), então ele entra na condição e imprime:

Parcela 1 R$ 30000.0

Após a impressao ele volta novamente para o for
o laço incrementa +1, assim, passando para parcela = 2.
Agora a parcela é 2.
Calcula o valor da parcela: valorParcela = 30.000 / 2 = 15.000.
O if verifica se 15.000 >= 1.000. É verdade, então entra na condição e imprime:
Parcela 2 R$ 15000.0
O laço retorna e incrementa +1 fazendo a variavel parcela ser 3. E assim por diante...




 */
