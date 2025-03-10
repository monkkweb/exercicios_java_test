package exercicio20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculadoraTest {

    @InjectMocks
    private Calculadora calculadora;

    @ParameterizedTest
    @CsvSource({"1, 2, 3, 3", "3, 2, 1, 3", "4, 5, 6, 6"})
    void deve_multiplicar_o_menor_numero_pelo_maior_numero_e_dividir_pelo_menor(int valorUm, int valorDois, int valorTres, int calculoEsperado) {
        var calculo = calculadora.calcular(valorUm, valorDois, valorTres);

        Assertions.assertEquals(calculoEsperado, calculo);
    }

    @Test
    void deve_estourar_execacao_pois_nao_pode_valores_negativos() {
        Assertions.assertThrows(RuntimeException.class, () -> calculadora.calcular(-1, 2, 3));
    }

    @Test
    void deve_estourar_execacao_pois_nao_pode_valor_zero() {
        Assertions.assertThrows(RuntimeException.class, () -> calculadora.calcular(0, 1, 2));
    }


}
