package exercicio8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CalculadoraDeVolumeTest {
    @Test
    void deve_calcular_oh_volume_de_uma_lata() {
        BigDecimal volumeEsperado = BigDecimal.valueOf(2148.85);
        BigDecimal raio = BigDecimal.valueOf(6);
        BigDecimal altura = BigDecimal.valueOf(19);

        var calculadora = new CaluladoraDeVolume();

        Assertions.assertEquals(volumeEsperado, calculadora.calcular(raio, altura));
    }
}
