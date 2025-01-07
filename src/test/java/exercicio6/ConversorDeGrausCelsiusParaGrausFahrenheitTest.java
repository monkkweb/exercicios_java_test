package exercicio6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ConversorDeGrausCelsiusParaGrausFahrenheitTest {
    @ParameterizedTest
    @CsvSource({"50d, 10d", "57.2, 14d", "86d, 30d"})
    void deve_converter_os_graus_celsius_para_os_graus_de_fahrenheit(double grausDeFahrenheitEsperado, double grusCelsius) {
        var conversor = new ConversorDeGrausCelsiusParaGrausFahrenheit();

        Assertions.assertEquals(grausDeFahrenheitEsperado, conversor.converter(grusCelsius));
    }
}
