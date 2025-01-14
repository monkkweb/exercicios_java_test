package exercicio16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DetectorDeNumerosTest {
    @Test
    void deve_exibir_o_primeiro_valor_pois_ele_eh_maior() {
        var resultadoEsperado = "O primeiro valor é o maior!";
        var valorUm = 4;
        var valorDois = 1;
        var detectar = new DetectorDeNumeros();

        var resultado = detectar.detectar(valorUm, valorDois);

        Assertions.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void deve_exibir_o_segundo_valor_pois_ele_eh_maior() {
        var resultadoEsperado = "O segundo valor é o maior!";
        var valorUm = 1;
        var valorDois = 4;
        var detectar = new DetectorDeNumeros();

        var resultado = detectar.detectar(valorUm, valorDois);

        Assertions.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void deve_exibir_que_os_valores_sao_igauis() {
        var resultadoEsperado = "Os valores são iguais!";
        var valorUm = 5;
        var valorDois = 5;
        var detectar = new DetectorDeNumeros();

        var resultado = detectar.detectar(valorUm, valorDois);

        Assertions.assertEquals(resultadoEsperado, resultado);
    }
}
