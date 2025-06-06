package academy.devdojo.maratonajava.Minterfaces.test;

import academy.devdojo.maratonajava.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
