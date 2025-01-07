package exercicio5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculadoraDeLitrosGastosDeCombustivelTest {
    @ParameterizedTest
    @CsvSource({"350d, 70d, 60d", "525d, 70d, 90d", " 600d, 90d, 80d"})
    void deve_efetuar_caulculo_de_quanto_de_combustivel_foi_gasto_em_uma_viagem(double combustivelGastoEsperado,
                                                                                double velocidade, double tempoPercorridoPorMinutos) {

        var calculadora = new CalculadoraDeLitrosGastosDeCombustivel();

        Assertions.assertEquals(combustivelGastoEsperado, calculadora.calcular(velocidade, tempoPercorridoPorMinutos));
    }
}
