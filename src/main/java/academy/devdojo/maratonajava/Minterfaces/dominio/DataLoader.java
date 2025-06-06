package academy.devdojo.maratonajava.Minterfaces.dominio;

//Dataloader existe para que qualquer classe que carregue os dados, de qualquer lugar, DB, file API e etc, siga a mesma regra implementada no método load
//quando vc cria uma interface vc n usa public class
//implements faz com que a classe siga um contrato pela interface DataLoader
//qualquer classe que me implementer deve fornecer implementacoes concretas desses métodos
// private -> default -> protected -> public
public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    };

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}

//Se numa classe abastrata vc colocar modificador de acesso default ou protect numa classe abastrata vc pode sobrescrever sobre protected ou public, nunca privado

//🔐 protected means:
//✅ Accessible in the same class
//
//✅ Accessible in subclasses, even if they’re in different packages
//
//✅ Accessible to other classes in the same package
//
//❌ Not accessible to unrelated classes in different packages
