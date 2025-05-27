package calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculadoraTest {
    @Captor
    private ArgumentCaptor<Double> argumentCaptor;
    @Mock
    private Impressora impressora;
    @Mock
    private Leitor leitor;
    @InjectMocks
    private Calculadora calculadora;

    @Test
    void deve_calcular_os_valores_no_negativo() {
        Mockito.when(leitor.lerNumero()).thenReturn(2d, 1d);
        Mockito.when(leitor.lerString()).thenReturn("-");

        calculadora.calcular();

        Mockito.verify(impressora).imprimir(argumentCaptor.capture());
        Assertions.assertEquals(1, argumentCaptor.getValue());
    }

    @Test
    void deve_calcular_os_valores_no_positivo() {
        Mockito.when(leitor.lerNumero()).thenReturn(2d, 1d);
        Mockito.when(leitor.lerString()).thenReturn("+");

        calculadora.calcular();

        Mockito.verify(impressora).imprimir(argumentCaptor.capture());
        Assertions.assertEquals(3, argumentCaptor.getValue());
    }

    @Test
    void deve_calcular_os_valores_na_divisao() {
        Mockito.when(leitor.lerNumero()).thenReturn(2d, 1d);
        Mockito.when(leitor.lerString()).thenReturn("/");

        calculadora.calcular();

        Mockito.verify(impressora).imprimir(argumentCaptor.capture());
        Assertions.assertEquals(2, argumentCaptor.getValue());
    }

    @Test
    void deve_calcular_os_valores_na_multiplicacao() {
        Mockito.when(leitor.lerNumero()).thenReturn(2d, 1d);
        Mockito.when(leitor.lerString()).thenReturn("*");

        calculadora.calcular();

        Mockito.verify(impressora).imprimir(argumentCaptor.capture());
        Assertions.assertEquals(2, argumentCaptor.getValue());
    }
}
