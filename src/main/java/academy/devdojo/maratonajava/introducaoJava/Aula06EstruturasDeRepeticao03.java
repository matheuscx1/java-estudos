package academy.devdojo.maratonajava.introducaoJava;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        double valorDoCarro = 30000;
        for (int parcela = (int)valorDoCarro; parcela >= 1; parcela--) {
            double valorParcela = valorDoCarro / parcela;
            if (valorParcela < 1000){
                continue;
            }
                System.out.println("Parcela " + parcela + "R$ " + valorParcela);
        }
    }
}

/*
Inicialização das variáveis:
A variável valorDoCarro carrega o valor do carro, que é 30000.
O for loop começa com a variável parcela igual ao valor do carro, ou seja, parcela = 30000.

O loop for:
O loop decremente a variável parcela em 1 a cada iteração:
parcela = 30000, 29999, 29998, ... até atingir parcela = 1.
Ou seja, o valor da parcela vai diminuir em 1 a cada ciclo do loop, começando de 30000 até 1.

Cálculo da divisão (valor da parcela):
Em cada iteração, o valor da parcela é calculado pela divisão do valor total do carro (30000) pela variável parcela:
valorParcela = valorDoCarro / parcela;

Condição de verificação:
O código verifica se o valor da parcela é menor que 1000:
Se o valor da parcela for menor que 1000, o continue faz o código pular a impressão e passar para a próxima iteração do loop.

 */
