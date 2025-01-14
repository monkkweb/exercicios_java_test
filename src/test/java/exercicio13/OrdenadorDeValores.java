package exercicio13;

import java.util.Arrays;
import java.util.Collections;

public class OrdenadorDeValores {
    private Leitor leitor;
    private Impressora impressora;

    public OrdenadorDeValores(Leitor leitor, Impressora impressora) {
        this.leitor = leitor;
        this.impressora = impressora;
    }

    public void ordenar() {
        Integer[] valores = new Integer[3];

        for (int i = 0; i < 3; i++) {
            valores[i] = leitor.ler();
        }

        Arrays.sort(valores, Collections.reverseOrder());

        impressora.imprimir(valores);
    }
}
