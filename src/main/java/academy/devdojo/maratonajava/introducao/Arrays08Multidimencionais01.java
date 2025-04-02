package academy.devdojo.maratonajava.introducao;

public class Arrays08Multidimencionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];

        //   i  j
        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;

        dias[1][0] = 4;
        dias[1][1] = 5;
        dias[1][2] = 6;

        dias[2][0] = 7;
        dias[2][1] = 8;
        dias[2][2] = 9;

        for (int i = 0; i < dias.length ; i++) {
            for (int j = 0; j < dias[i].length ; j++) {
                System.out.println(dias[i][j]);

            }

        }

        for (int[] arrayBase: dias){
            for(int num: arrayBase){
                System.out.println(num);
            }
        }


    }
}
