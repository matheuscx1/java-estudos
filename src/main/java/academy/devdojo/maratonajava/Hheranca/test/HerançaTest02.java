package academy.devdojo.maratonajava.Hheranca.test;

import academy.devdojo.maratonajava.Hheranca.dominio.Funcionario;

public class HerançaTest02 {
//    0 -  Bloco de inicialização estático da super classe é executado quando a JVM carregar classe pai
//    1 - Bloco de inicialização estático da sub classe é executado quando a JVM carregar classe filha
//    2 - Alocado espaco em memória pro objeto da superclsase
//    3 - Cada atributo desuperclsase é criado e inicializado com valores default ou o que for passado
//    4 - Bloco de inicialização da superclsase é executado
//    5 - construtor é executado da superclsase//

//    6 - Alocado espaco em memória pro objeto da subclasse
//    7 - Cada atributo de subclasse é criado e inicializado com valores default ou o que for passado da classe
//    8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
//    9 - construtor é executado da subclasse

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Matheus");
    }
}

//Bloco de inicialização estatico que é executado apenas uma vez
//Apos isso inicia o bloco estatico de funcionario
//Depois que iniciar o bloco estatic do filho, volta no pai

