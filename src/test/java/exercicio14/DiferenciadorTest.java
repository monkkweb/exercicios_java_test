package exercicio14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DiferenciadorTest {
    @ParameterizedTest
    @CsvSource({"3, 6d, 3d", "4, 3d, 7d", "0, 5d, 5d"})
    void deve_exibir_ah_diferenca_entre_os_dois_valores(double diferencaEsperada, double valorUm, double valorDois) {
        var diferenciador = new Diferenciador();

        var resultado = diferenciador.diferenciar(valorUm, valorDois);

        Assertions.assertEquals(diferencaEsperada, resultado);
    }
}
