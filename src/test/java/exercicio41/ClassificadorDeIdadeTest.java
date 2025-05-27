package exercicio41;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ClassificadorDeIdadeTest {
    @InjectMocks
    private ClassificadorDeIdade classificador;

    @ParameterizedTest
    @CsvSource({"5", "6", "7"})
    void deve_retornar_infantil_a_quando_idade_for_entre_5_e_7(double idade) {
        var esperada = "Infantil A";

        var resultado = classificador.classificar(idade);

        Assertions.assertEquals(esperada, resultado);
    }

    @ParameterizedTest
    @CsvSource({"8", "9", "10", "11"})
    void deve_retornar_infantil_b_quando_idade_for_entre_8_e_11(double idade) {
        var esperada = "Infantil B";

        var resultado = classificador.classificar(idade);

        Assertions.assertEquals(esperada, resultado);
    }

    @ParameterizedTest
    @CsvSource({"12", "13"})
    void deve_retornar_juvenil_a_quando_idade_for_12_e_13(double idade) {
        var esperada = "Juvenil A";

        var resultado = classificador.classificar(idade);

        Assertions.assertEquals(esperada, resultado);
    }

    @ParameterizedTest
    @CsvSource({"14", "15", "16", "17"})
    void deve_retornar_juvenil_b_quando_idade_for_entre_14_e_17(double idade) {
        var esperada = "Juvenil B";

        var resultado = classificador.classificar(idade);

        Assertions.assertEquals(esperada, resultado);
    }

    @Test
    void deve_retornar_adulto_quando_idade_dor_maior_de_18() {
        var esperada = "Adulto";
        var idade = 22;

        var resultado = classificador.classificar(idade);

        Assertions.assertEquals(esperada, resultado);
    }

}