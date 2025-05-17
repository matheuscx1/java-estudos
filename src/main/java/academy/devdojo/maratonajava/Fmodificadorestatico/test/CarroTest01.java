package academy.devdojo.maratonajava.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
    Carro c1 = new Carro("BMW", 280);
    Carro c2 = new Carro("Audi", 275);
    Carro c3 = new Carro("Honda", 290);

    Carro.setVelocidadeLimite(180); // Modifies the static variable `velocidadeLimite` for all instances of Carro
    //dessa forma todas as instancia de carros vao ter valor associado ao limite 180;
        // esta acessando atraves do nome da classe e afetara todos os objetos em existencia daquela classe

    //c1.setVelocidadeLimite(180);
    //vai continuar 250, se vc fizer isso
        // isso significa q nao esta funcionando apropriadamente

        //precisa de algo q seja independente do objeto, que afete a instancia em si. precisa criar um modificador statico
        

   c1.imprime();
   c2.imprime();
   c3.imprime();

    }
}
