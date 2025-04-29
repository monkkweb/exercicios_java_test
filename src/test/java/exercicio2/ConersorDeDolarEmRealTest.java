package exercicio2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ConersorDeDolarEmRealTest {
    @Captor
    private ArgumentCaptor<Double> argumentCaptor;
    @Mock
    private Leitor leitor;
    @Mock
    private Impressora impressora;
    @InjectMocks
    private ConversorDeDolarEmReal conversor;

    @ParameterizedTest
    @CsvSource({"367.8, 6.13, 60d", "429.1, 6.13, 70d", "490.1, 6.13, 80d"})
    void deve_converter_oh_valor_do_dolar_para_oh_real(double valorRealEsperado, double cotacaoDolar, double valorEmDolar) {
        Mockito.when(leitor.ler()).thenReturn(cotacaoDolar).thenReturn(valorEmDolar);

        conversor.converter();

        Mockito.verify(impressora).imprimir(argumentCaptor.capture());
        Assertions.assertEquals(valorRealEsperado, argumentCaptor.getValue(), 1);
    }
}