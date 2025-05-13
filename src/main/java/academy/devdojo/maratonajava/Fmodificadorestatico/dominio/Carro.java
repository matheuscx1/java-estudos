package academy.devdojo.maratonajava.Fmodificadorestatico.dominio;

public class Carro {
    private String nome; // Instance variable to hold the car's name
    private double velocidadeMaxima; // Instance variable to hold the car's maximum speed
    public static double velocidadeLimite = 250; // Static variable that belongs to the class, not the instance


    //depois de colcoar o modificador estatico, agora pertence ao carro, a classe carro
    //entao é meio q dizer q essa variavel nao faz mais parte do objeto em si,a gora pertence a carro
    //nao pertence mais a uma instancia


    //static method need to be in second


    //this se refere a isntancia do objeto

    // Constructor for creating a new Carro object, initializing its attributes.

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }


    // This method prints the car's details (name, max speed, and the velocity limit).
    // Notice that we can access the static variable `velocidadeLimite` using `this`,
    // but it's better practice to use `Carro.velocidadeLimite` since it belongs to the class, not an instance.


    public void imprime(){
        System.out.println("-----------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("VelocidadeMaxima: " + this.velocidadeMaxima);
        System.out.println("VelocidadeLimite: " + this.velocidadeLimite);
    }                                              //vc coloca Carro.velocidadeLimite


    // Getter and setter methods for the car's attributes

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}


