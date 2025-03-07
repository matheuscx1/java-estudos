package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {// 3 formas de fazer array
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 =  new int[]{1,2,3,4,5};

        for (int i = 0; i < numeros2.length ; i++) {
            System.out.println(numeros3[i]);

        }


        // versao simplificada do for sem indice
        // num vai percorrer o array, na primeira iteração pega o primeiro, dps o proximo e assim por diante
        for(int num:numeros3){
            System.out.println(num);
        }
    }
}
