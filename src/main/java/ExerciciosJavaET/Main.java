package ExerciciosJavaET;




public class Main {
    public static int getBattery(int[] eventos){
        int bateria = 50;

        for (int evento : eventos){
            bateria += evento;

            if(bateria >100){
                bateria = 100;
            } else if(bateria < 0){
                bateria = 0;
            }

        }

        return bateria;
    }

    public static void main(String[] args) {
        int[] eventos = {10, -20, 61, -15};
        System.out.println(getBattery(eventos));
    }
}
