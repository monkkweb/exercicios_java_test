package exercicio25;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculadoraDePesoIdealTest {

    @Captor
    private ArgumentCaptor<?> argumentCaptor;
    @Mock
    private Leitor leitor;
    @Mock
    private Impressora impressora;
    @InjectMocks
    private CalculadoraDePesoIdeal calculadoraDePesoIdeal;

    @Test
    void peso_ideal_para_mulheres() {
        var valorEsperado = "54,66Kg";
        Mockito.when(leitor.lerString()).thenReturn("Feminino");
        Mockito.when(leitor.lerNumero()).thenReturn(1.60d);


        calculadoraDePesoIdeal.calcular();

        Mockito.verify(impressora).imprimir(argumentCaptor.capture());
        Assertions.assertEquals(valorEsperado, argumentCaptor.getValue());
    }

    @Test
    void peso_ideal_para_homens() {
        var valorEsperado = "72,86Kg";
        Mockito.when(leitor.lerString()).thenReturn("Masculino");
        Mockito.when(leitor.lerNumero()).thenReturn(1.80d);


        calculadoraDePesoIdeal.calcular();

        Mockito.verify(impressora).imprimir(argumentCaptor.capture());
        Assertions.assertEquals(valorEsperado, argumentCaptor.getValue());
    }
}
