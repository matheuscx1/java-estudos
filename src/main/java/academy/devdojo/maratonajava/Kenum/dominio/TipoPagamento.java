package academy.devdojo.maratonajava.Kenum.dominio;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };


    //força as subclasse ou enum a ter sua propria implementação desse método
    //não possui corpo
    public abstract double calcularDesconto(double valor);
}
