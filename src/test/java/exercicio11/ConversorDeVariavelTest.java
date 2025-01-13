package exercicio11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ConversorDeVariavelTest {
    @Mock
    private Impressora impressora;
    @Mock
    private Leitor leitor;
    @Captor
    private ArgumentCaptor<Integer> argumentCaptor;
    @InjectMocks
    private ConversorDeVariavel conversor;

    @Test
    void deve_inverter_o_valor_da_variavel_valorUm_com_o_valor_da_variavel_valorDois() {
        var valorUmEsperado = 1;
        Mockito.when(leitor.ler()).thenReturn(2).thenReturn(1);

        conversor.converter();

        Mockito.verify(impressora, Mockito.times(2)).imprimir(argumentCaptor.capture());
        Assertions.assertEquals(valorUmEsperado, argumentCaptor.getAllValues().get(0));
    }
    @Test
    void deve_inverter_o_valor_da_variavel_valorDois_com_o_valor_da_variavel_valorUm() {
        var valorUmEsperado = 2;
        Mockito.when(leitor.ler()).thenReturn(2).thenReturn(1);

        conversor.converter();

        Mockito.verify(impressora, Mockito.times(2)).imprimir(argumentCaptor.capture());
        Assertions.assertEquals(valorUmEsperado, argumentCaptor.getAllValues().get(1));
    }
}
