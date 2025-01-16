package exercicio19;

public class TipoDeTriangulo {
    private Leitor leitor;
    private Impressora impressora;

    public TipoDeTriangulo(Leitor leitor, Impressora impressora) {
        this.leitor = leitor;
        this.impressora = impressora;
    }

    public void calcular() {
        var ladoA = leitor.ler();
        var ladoB = leitor.ler();
        var ladoC = leitor.ler();

        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
            if (ladoA == ladoB && ladoB == ladoC)
                impressora.imprimir("O triângulo é Equilátero.");
            else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC)
                impressora.imprimir("O triângulo é Isósceles.");
            else
                impressora.imprimir("O triângulo é Escaleno.");

        } else throw new RuntimeException("Os lados fornecidos não caracterizam um triângulo");

    }
}
