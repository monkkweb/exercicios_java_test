package sla;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class IdentificadorTest {
    @InjectMocks
    private Identificador idendtificador;

    @ParameterizedTest
    @CsvSource({"-1", "-2", "-3"})
    void idendtificar_numero_negativo(int valor) {
        var esperado = "Negativo porra";

        var resultado = idendtificador.identificar(valor);

        Assertions.assertEquals(esperado, resultado);
    }

    @ParameterizedTest
    @CsvSource({"1", "2", "3"})
    void idendtificar_numero_positivo(int valor) {
        String esperado = "Positivo porra";

        var resultado = idendtificador.identificar(valor);

        Assertions.assertEquals(esperado, resultado);
    }
}
