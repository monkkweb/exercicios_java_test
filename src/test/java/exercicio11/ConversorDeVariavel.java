package exercicio11;


public class ConversorDeVariavel {
    private final Leitor leitor;
    private final Impressora impressora;

    public ConversorDeVariavel(Leitor leitor, Impressora impressora) {
        this.leitor = leitor;
        this.impressora = impressora;
    }

    public void converter() {
        int variavelLocal;
        var valorUm = leitor.ler();
        var valorDois = leitor.ler();

        variavelLocal = valorUm;
        valorUm = valorDois;
        valorDois = variavelLocal;

        impressora.imprimir(valorUm);
        impressora.imprimir(valorDois);
    }
}
