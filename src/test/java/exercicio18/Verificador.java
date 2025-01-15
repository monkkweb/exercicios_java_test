package exercicio18;

public class Verificador {
    private Leitor leitor;
    private Impressora impressora;

    public Verificador(Leitor leitor, Impressora impressora) {
        this.leitor = leitor;
        this.impressora = impressora;
    }

    public void verificar() {
        var codigo = leitor.ler();

        if (codigo != 1 && codigo != 2 && codigo != 3)
            throw new RuntimeException("Codigo invalido!");
        if (codigo == 1)
            impressora.imprimir("Um");
        if (codigo == 2)
            impressora.imprimir("Dois");
        if (codigo == 3)
            impressora.imprimir("Tres");
    }
}
