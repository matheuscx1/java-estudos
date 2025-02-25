package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        // Doar se salario > 5000
        //Operador ternario: (condicao) ? verdadeiro : falso

        String resultado = salario > 5000 ?  "Eu vou doar 500 agora" : "No momento, não posso doar";
        System.out.println(resultado);
    }
}
