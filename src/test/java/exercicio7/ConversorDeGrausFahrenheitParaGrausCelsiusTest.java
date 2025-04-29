package exercicio7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ConversorDeGrausFahrenheitParaGrausCelsiusTest {
    @ParameterizedTest
    @CsvSource({"30d, 86d", "17, 62.6d", "25d, 77d"})
    void deve_converter_os_graus_em_fahrenheit_para_os_graus_celsius(double grausDeCelsiustEsperado, double grausFahrenheit) {
        var conversor = new ConversorDeGrausFahrenheitParaGrausCelsius();

        var resultado = conversor.converter(grausFahrenheit);

       Assertions.assertEquals(grausDeCelsiustEsperado, resultado);
    }
}
