package exercicio9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculadoraDeIdadeEmDiasTest {
    @ParameterizedTest
    @CsvSource({"1276, 3, 6, 1", "1672, 4, 7, 2", "2068, 5, 8, 3"})
    void deve_calcular_ah_idade_de_uma_pessoa_em_dias(int diasEsperados, int anos, int meses, int dias) {
        var calculadora = new CalculadoraDeIdadeEmDias();

        Assertions.assertEquals(diasEsperados, calculadora.calcular(anos, meses, dias));
    }
}
