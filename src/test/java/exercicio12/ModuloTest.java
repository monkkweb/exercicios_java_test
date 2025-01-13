package exercicio12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModuloTest {
    @Test
    void deve_retornar_o_valor_do_modulo_igual_ao_valor_inicial_caso_ele_seja_maior_ou_igual_a_zero(){
        var modoloEsperado = 12;
        var valor = 12;
        var modolo = new Modulo();

        var resultado = modolo.converter(valor);

        Assertions.assertEquals(modoloEsperado, resultado);
    }

    @Test
    void deve_retornar_o_valor_modulado_pois_o_valor_vai_ser_menor_que_zer(){
        var modoloEsperado = 5;
        var valor = -5;
        var modolo = new Modulo();

        var resultado = modolo.converter(valor);

        Assertions.assertEquals(modoloEsperado, resultado);
    }
}
