package exercicio13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OrdenadorDeValoresTest {
    @Captor
    private ArgumentCaptor<Integer[]> argumentCaptor;
    @Mock
    private Leitor leitor;
    @Mock
    private Impressora impressora;
    @InjectMocks
    private OrdenadorDeValores ordenador;

    @Test
    void deve_ordenar_em_ordem_decrescente_os_tres_valores() {
        Integer[] ordemEsperada = {3, 2, 1};
        Mockito.when(leitor.ler()).thenReturn(1).thenReturn(2).thenReturn(3);

        ordenador.ordenar();

        Mockito.verify(impressora).imprimir(argumentCaptor.capture());
        Assertions.assertArrayEquals(ordemEsperada, argumentCaptor.getValue());
    }
}
