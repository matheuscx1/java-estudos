package academy.devdojo.maratonajava.Minterfaces.dominio;

//Dataloader existe para que qualquer classe que carregue os dados, de qualquer lugar, DB, file API e etc, siga a mesma regra implementada no método load
//quando vc cria uma interface vc n usa public class

public interface DataLoader {
    public abstract void load();
}
