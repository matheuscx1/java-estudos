package academy.devdojo.maratonajava.AintroducaoclassesPOO.ExerciciosPOO.Classes;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Uno";
        carro.modelo = "mille";
        carro.ano = 2008;

        carro2.nome = "Mustang";
        carro2.modelo = "GT";
        carro2.ano = 2018;


        System.out.println(carro.nome + " " + carro.modelo + " " + carro.ano);
        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);



        //Caso voce queira referenciar a mesma variavel faça: carro = carro2
        //Isso irá fazer com que carro1 referencie carro2 agora;
        // Faça isso apenas com objetos do mesmo tipo de herança 


    }

}
