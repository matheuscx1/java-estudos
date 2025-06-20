package academy.devdojo.maratonajava.QString.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println(" Tempo gasto para String " + (fim - inicio) + " ms ");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println(" Tempo gasto para StringBuilder " + (fim - inicio) + " ms ");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println(" Tempo gasto para StringBuffer " + (fim - inicio) + " ms ");
    }


    //A cada += cria um novo objeto na memoria, ficando lento
    private static void concatString(int tamanho) {
        String texto = "";//começa em 0
        for (int i = 0; i < tamanho; i++) {
            texto += i; //0,01,012,013. Converte i em em string e vai adicionando o numero um do lado do outro a cada loop
        }
    }


    //cria um unico objeto e vai sendo adicionado, sem substituir ou recriar
    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);//a cada iteração vai adicionando o numero, 0123...
        }
    }


    //cria um unico objeto e vai sendo adicionado, sem substituir ou recriar
    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i); //a cada iteração vai adicionando o numero, 0123...
        }
    }
}
