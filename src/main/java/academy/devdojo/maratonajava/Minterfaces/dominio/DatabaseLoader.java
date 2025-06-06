package academy.devdojo.maratonajava.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados no banco de dados");
    }
}
