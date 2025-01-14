package exercicio15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadorDeAprovacaoTest {
    @Test
    void deve_retornar_mensagem_de_aprovado_pois_a_media_foi_maior_ou_igual_ah_sete() {
        var resultadoEsperado = "Aprovado";
        var notaUm = 7d;
        var notaDois = 7d;
        var notaTres = 7d;
        var notaQuatro = 7d;
        var notaDeRecuperacao = 0d;
        var calculadora = new CalculadorDeAprovacao();

        var resultado = calculadora.calcular(notaUm, notaDois, notaTres, notaQuatro, notaDeRecuperacao);

        Assertions.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void deve_retornar_mensagem_de_reprovado_pois_a_media_foi_menor_que_sete() {
        var resultadoEsperado = "Reprovado";
        var notaUm = 5d;
        var notaDois = 5d;
        var notaTres = 5d;
        var notaQuatro = 5d;
        var notaDeRecuperacao = 1d;
        var calculadora = new CalculadorDeAprovacao();

        var resultado = calculadora.calcular(notaUm, notaDois, notaTres, notaQuatro, notaDeRecuperacao);

        Assertions.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void deve_retornar_mensagem_de_aprovado_com_media_baixa_e_recuperacao_alta() {
        var resultadoEsperado = "Aprovado";
        var notaUm = 5d;
        var notaDois = 5d;
        var notaTres = 5d;
        var notaQuatro = 5d;
        var notaDeRecuperacao = 7d;
        var calculadora = new CalculadorDeAprovacao();

        var resultado = calculadora.calcular(notaUm, notaDois, notaTres, notaQuatro, notaDeRecuperacao);

        Assertions.assertEquals(resultadoEsperado, resultado);
    }

}
