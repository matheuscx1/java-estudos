package academy.devdojo.maratonajava.AintroducaoclassesPOO.test;

import academy.devdojo.maratonajava.AintroducaoclassesPOO.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();


        estudante.nome = "Sanji";
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);
        System.out.println("------------------");

        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.nome);

        //Aqui,estudante2 esta null por que não tem nada na memoria
        //a menos que voce mude na classe principal (Estudante) e coloque o valor

        //Colocar um valor na classe principal muda todo o resto das outras classes
    }
}
