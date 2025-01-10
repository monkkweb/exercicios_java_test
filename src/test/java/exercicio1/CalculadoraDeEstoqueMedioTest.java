package exercicio1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculadoraDeEstoqueMedioTest {
    @ParameterizedTest
    @CsvSource({"4, 4, 4", "5, 5, 5", "6, 6, 6"})
    void deve_calcular_oh_estoque_medio_de_um_produto(double mediaEsperada, double quantidadeMaxima, double quantidadeMinima) {
        var calculadoraDeEstoqueMedio = new CalculadoraDeEstoqueMedio();

        var resultado = calculadoraDeEstoqueMedio.calcular(quantidadeMaxima, quantidadeMinima);

        Assertions.assertEquals(mediaEsperada, resultado);
    }
}
