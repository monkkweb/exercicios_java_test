package exercicio44;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ExercicioTest {
    @Captor
    private ArgumentCaptor<String> argumentCaptorString;
    @Captor
    private ArgumentCaptor<Double> argumentCaptorNumerico;
    @Mock
    private Leitor leitor;
    @Mock
    private Impressora impressora;
    @InjectMocks
    private Cleiton exercicio;

    @Test
    void quando_comando_um_ser_acionado_deve_converter_graus_ceusius_em_graus_fahrenheit() {
        Mockito.when(leitor.ler()).thenReturn(1d).thenReturn(35d);

        exercicio.executar();

        Mockito.verify(impressora).imprimir(argumentCaptorNumerico.capture(), argumentCaptorString.capture());
        Assertions.assertEquals(95d, argumentCaptorNumerico.getValue());
        Assertions.assertEquals("F", argumentCaptorString.getValue());
    }

    @Test
    void quando_comando_dois_ser_acionado_deve_converter_graus_fahrenheit_em_graus_ceusius() {
        Mockito.when(leitor.ler()).thenReturn(2d).thenReturn(84d);

        exercicio.executar();

        Mockito.verify(impressora).imprimir(argumentCaptorNumerico.capture(), argumentCaptorString.capture());
        Assertions.assertEquals(28.88, argumentCaptorNumerico.getValue(), 2);
        Assertions.assertEquals("C", argumentCaptorString.getValue());
    }

    @Test
    void quando_comando_tres_ser_acionado_deve_retornar_peso_ideal_de_um_homem_de_acordo_com_ah_altura() {
        Mockito.when(leitor.ler()).thenReturn(3d).thenReturn(1.63);

        exercicio.executar();

        Mockito.verify(impressora).imprimir(argumentCaptorNumerico.capture(), argumentCaptorString.capture());
        Assertions.assertEquals(60.50, argumentCaptorNumerico.getValue(), 2);
        Assertions.assertEquals("Kg", argumentCaptorString.getValue());
    }

    @Test
    void quando_comando_quatro_ser_acionado_deve_retornar_peso_ideal_de_uma_mulher_de_acordo_com_ah_altura() {
        Mockito.when(leitor.ler()).thenReturn(4d).thenReturn(1.53);

        exercicio.executar();

        Mockito.verify(impressora).imprimir(argumentCaptorNumerico.capture(), argumentCaptorString.capture());
        Assertions.assertEquals(50.31, argumentCaptorNumerico.getValue(), 2);
        Assertions.assertEquals("Kg", argumentCaptorString.getValue());
    }
}
