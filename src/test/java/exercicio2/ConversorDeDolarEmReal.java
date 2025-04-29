package exercicio2;

public class ConversorDeDolarEmReal {

    private  Leitor leitor;
    private Impressora impressora;

    public ConversorDeDolarEmReal(Leitor leitor, Impressora impressora) {
        this.leitor = leitor;
        this.impressora = impressora;
    }

    void converter() {
        var cotacaoDolar = leitor.ler();
        var valorEmDolar = leitor.ler();
        var resultado = valorEmDolar * cotacaoDolar;
        impressora.imprimir(resultado);
    }
}
