package exercicio8;

import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_CEILING;

public class CaluladoraDeVolume {
    private static final BigDecimal VALOR_DE_PI = BigDecimal.valueOf(3.14159);

    public BigDecimal calcular(BigDecimal raio, BigDecimal altura) {
        var resultado = VALOR_DE_PI.multiply(raio).multiply(raio).multiply(altura);
        var a = new BigDecimal(String.valueOf(resultado));
        return a.setScale(2, ROUND_CEILING);
    }
}
