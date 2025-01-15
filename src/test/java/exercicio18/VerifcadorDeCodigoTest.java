package exercicio18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static java.lang.Integer.MAX_VALUE;

@ExtendWith(MockitoExtension.class)
public class VerifcadorDeCodigoTest {
    @Captor
    private ArgumentCaptor<String> argumentCaptor;
    @Mock
    private Leitor leitor;
    @Mock
    private Impressora impressora;
    @InjectMocks
    private Verificador verificador;

    @Test
    void deve_mandar_um_valor_valido_e_retornar_a_mensagem() {
        var mensagemEsperada = "Um";
        Mockito.when(leitor.ler()).thenReturn(1);

        verificador.verificar();

        Mockito.verify(impressora).imprimir(argumentCaptor.capture());
        Assertions.assertEquals(mensagemEsperada, argumentCaptor.getValue());
    }

    @Test
    void deve_explodir_execacao_pois_cogido_eh_invalido() {
        Mockito.when(leitor.ler()).thenReturn(MAX_VALUE);

        Assertions.assertThrows(RuntimeException.class, () -> verificador.verificar());
    }
}
