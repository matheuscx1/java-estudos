package academy.devdojo.maratonajava.Kenum.dominio;

//enums são para rotulos, categoria, status ou tipos
//constante é um valor que nunca pode ser mudado depois de configurado
//consturam ser declarados com final ou static(compartilha por todos os objetos)
public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa juridica");

    private int valor;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public int getValor() {
        return valor;
    }

    //Faça um loop for para achar dados compativeis com todas as constantes, exemplo: pessoa fisica = pessoa fisica, pessoa juridica = juridica e etc
    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()) {
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    };

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}

