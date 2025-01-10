package exercicio3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ComissaoTest {

    @ParameterizedTest
    @CsvSource({"2500.0, 1000, 50", "25000.0, 500, 1000", "8742.0, 744, 235"})
    void deve_calcular_ah_comissao_do_funcionario(double comissaoEsperada, double valorDaPeca, double quantidadeVendida) {
        var calculadoraDeComissao = new CalculadoraDeComissoes();

        var resultado = calculadoraDeComissao.calcular(valorDaPeca,quantidadeVendida);

        Assertions.assertEquals(comissaoEsperada, resultado);
    }
}
