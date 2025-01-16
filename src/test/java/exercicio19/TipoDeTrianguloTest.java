package exercicio19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TipoDeTrianguloTest {
    @Captor
    private ArgumentCaptor<String> argumentCaptor;
    @Mock
    private Leitor leitor;
    @Mock
    private Impressora impressora;
    @InjectMocks
    private TipoDeTriangulo tipoDeTriangulo;

    @Test
    void deve_retornar_um_triangulo_triangulo_equilatero() {
        var mensagemEsperada = "O triângulo é Equilátero.";
        Mockito.when(leitor.ler()).thenReturn(3).thenReturn(3).thenReturn(3);

        tipoDeTriangulo.calcular();

        Mockito.verify(impressora).imprimir(argumentCaptor.capture());
        Assertions.assertEquals(mensagemEsperada, argumentCaptor.getValue());
    }

    @Test
    void deve_retornar_um_triangulo_triangulo_escaleno() {
        var mensagemEsperada = "O triângulo é Escaleno.";
        Mockito.when(leitor.ler()).thenReturn(10).thenReturn(5).thenReturn(6);

        tipoDeTriangulo.calcular();

        Mockito.verify(impressora).imprimir(argumentCaptor.capture());
        Assertions.assertEquals(mensagemEsperada, argumentCaptor.getValue());
    }

    @Test
    void deve_retornar_um_triangulo_triangulo_isosceles() {
        var mensagemEsperada = "O triângulo é Isósceles.";
        Mockito.when(leitor.ler()).thenReturn(3).thenReturn(3).thenReturn(2);

        tipoDeTriangulo.calcular();

        Mockito.verify(impressora).imprimir(argumentCaptor.capture());
        Assertions.assertEquals(mensagemEsperada, argumentCaptor.getValue());
    }

    @Test
    void deve_explodir_a_execacao() {
        Mockito.when(leitor.ler()).thenReturn(3).thenReturn(2).thenReturn(1);

        Assertions.assertThrows(RuntimeException.class, () -> tipoDeTriangulo.calcular());
    }
}
