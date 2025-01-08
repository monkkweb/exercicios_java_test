package exercicio8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraDeVolumeTest {
    @Test
    void deve_calcular_oh_volume_de_uma_lata() {
        var volumeEsperado = "2148,85 cm³";
        var raio = 6;
        var altura = 19;

        var calculadora = new CaluladoraDeVolume();

        Assertions.assertEquals(volumeEsperado, calculadora.calcular(raio, altura));
    }
}
