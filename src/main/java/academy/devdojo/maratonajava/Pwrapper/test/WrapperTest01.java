package academy.devdojo.maratonajava.Pwrapper.test;


//transforma tipos primitivos em objetos
public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP= 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW= 1; // autoboxing. Java faz a conversao para um wrapper
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        boolean booleanW = false;

        int i = intW; // unboxing vc vai do wrapper pro tipo primitivo
        Integer intW2 = Integer.parseInt("1");//
        boolean verdaediro = Boolean.parseBoolean("True");
        System.out.println(verdaediro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('!'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));

    }
}
