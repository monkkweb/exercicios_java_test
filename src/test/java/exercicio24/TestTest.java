package exercicio24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestTest {
    @Captor
    private ArgumentCaptor<String> argumentCaptor;
    @Mock
    private Leitor leitor;
    @Mock
    private Impressora impressora;
    @InjectMocks
    private Verificador verificador;

    @Test
    void verifica_botao_1_numero_tem_que_ser_multiplo_e_retornar_mensagem() {
        Mockito.when(leitor.lerNumero()).thenReturn(20).thenReturn(20);
        Mockito.when(leitor.lerString()).thenReturn("1").thenReturn("4");

        verificador.verificar();

        Mockito.verify(impressora).imprimir(argumentCaptor.capture());
        Assertions.assertEquals("Numero é multiplo!", argumentCaptor.getValue());
    }

    @Test
    void verifica_botao_1_numero_nao_eh_multiplo_e_retornar_mensagem() {
        Mockito.when(leitor.lerNumero()).thenReturn(7).thenReturn(5);
        Mockito.when(leitor.lerString()).thenReturn("1").thenReturn("4");

        verificador.verificar();

        Mockito.verify(impressora).imprimir(argumentCaptor.capture());
        Assertions.assertEquals("Não é multiplo!", argumentCaptor.getValue());
    }

    @Test
    void verificar_o_botao_2_numeros_sao_pares() {
        Mockito.when(leitor.lerNumero()).thenReturn(2).thenReturn(4);
        Mockito.when(leitor.lerString()).thenReturn("2").thenReturn("4");

        verificador.verificar();

        Mockito.verify(impressora).imprimir(argumentCaptor.capture());
        Assertions.assertEquals("Os valores são pares!", argumentCaptor.getValue());
    }

    @Test
    void verificar_o_botao_2_numeros_sao_impares() {
        Mockito.when(leitor.lerNumero()).thenReturn(3).thenReturn(3);
        Mockito.when(leitor.lerString()).thenReturn("2").thenReturn("4");

        verificador.verificar();

        Mockito.verify(impressora).imprimir(argumentCaptor.capture());
        Assertions.assertEquals("Os valores são impares!", argumentCaptor.getValue());
    }

    @Test
    void verificar_o_botao_3_media_igual_ah_sete() {
        Mockito.when(leitor.lerNumero()).thenReturn(7).thenReturn(7);
        Mockito.when(leitor.lerString()).thenReturn("3").thenReturn("4");

        verificador.verificar();

        Mockito.verify(impressora).imprimir(argumentCaptor.capture());
        Assertions.assertEquals("Igual á 7!", argumentCaptor.getValue());
    }

    @Test
    void verificar_o_botao_3_media_menor_que_sete() {
        Mockito.when(leitor.lerNumero()).thenReturn(3).thenReturn(3);
        Mockito.when(leitor.lerString()).thenReturn("3").thenReturn("4");

        verificador.verificar();

        Mockito.verify(impressora).imprimir(argumentCaptor.capture());
        Assertions.assertEquals("Menor que 7!", argumentCaptor.getValue());
    }

    @Test
    void verificar_o_botao_3_media_maior_que_sete() {
        Mockito.when(leitor.lerNumero()).thenReturn(8).thenReturn(8);
        Mockito.when(leitor.lerString()).thenReturn("3").thenReturn("4");

        verificador.verificar();

        Mockito.verify(impressora).imprimir(argumentCaptor.capture());
        Assertions.assertEquals("Maior que 7!", argumentCaptor.getValue());
    }

}
