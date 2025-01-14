package exercicio17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercicio17Test {
    @Test
    void deve_retornar_valor_valido_pois_o_valor_esta_entre_os_valores_aceitos() {
        var mensagemEsperada = "Valor valido";
        var valor = 6;
        var vericador = new Verificador();

        var resultado = vericador.verificar(valor);

        Assertions.assertEquals(mensagemEsperada, resultado);
    }

    @Test
    void deve_retornar_valor_invalido_pois_o_valor_nao_esta_entre_os_valores_aceitos() {
        var mensagemEsperada = "Valor invalido";
        var valor = 100;
        var vericador = new Verificador();

        var resultado = vericador.verificar(valor);

        Assertions.assertEquals(mensagemEsperada, resultado);
    }
}
