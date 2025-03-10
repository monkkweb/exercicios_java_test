package exercicio21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class VerificadorTest {
    @Mock
    private Leitor leitor;
    @Mock
    private Impressora impressora;
    @Captor
    private ArgumentCaptor<String> argumentCaptor;
    @InjectMocks
    private Verificador verificador;

    @Test
    void verifica_Se_eh_positivo() {
        var mensagemEsperada = "Positivo!";
        Mockito.when(leitor.lerNumero()).thenReturn(1D).thenReturn(2D);
        Mockito.when(leitor.lerString()).thenReturn("Sim").thenReturn("não");

        verificador.verificar();

        Mockito.verify(impressora, Mockito.times(4)).imprimir(argumentCaptor.capture());
        Assertions.assertEquals(mensagemEsperada, argumentCaptor.getAllValues().get(0));
    }

    @Test
    void deve_retornar_negativo_pois_o_valor_sera_negativo() {
        var mensagemEsperada = "Negativo!";
        Mockito.when(leitor.lerNumero()).thenReturn(1D).thenReturn(-2D);
        Mockito.when(leitor.lerString()).thenReturn("Sim").thenReturn("não");

        verificador.verificar();

        Mockito.verify(impressora, Mockito.times(4)).imprimir(argumentCaptor.capture());
        Assertions.assertEquals(mensagemEsperada, argumentCaptor.getAllValues().get(2));
    }

    @Test
    void deve_retornar_mensagem_se_quer_mandar_outro_valor() {
        var mensagemEsperada = "Outro valor?";
        Mockito.when(leitor.lerNumero()).thenReturn(1D).thenReturn(-2D);
        Mockito.when(leitor.lerString()).thenReturn("Sim").thenReturn("não");

        verificador.verificar();

        Mockito.verify(impressora, Mockito.times(4)).imprimir(argumentCaptor.capture());
        Assertions.assertEquals(mensagemEsperada, argumentCaptor.getAllValues().get(1));
    }

}
