package exercicio20;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Calculadora {
    public int calcular(int valorUm, int valorDois, int valorTres) {
        if (valorUm <= 0 || valorDois <= 0 || valorTres <= 0)
            throw new RuntimeException("VALOR NÃO PODE SER ZERO/NEGATIVO!");

        var maior = MIN_VALUE;
        var menor = MAX_VALUE;
        if (valorUm > valorDois && valorUm > valorTres)
            maior = valorUm;
        if (valorDois > valorUm && valorDois > valorTres)
            maior = valorDois;
        if (valorTres > valorUm && valorTres > valorDois)
            maior = valorTres;
        if (valorUm < valorDois && valorUm < valorTres)
            menor = valorUm;
        if (valorDois < valorUm && valorDois < valorTres)
            menor = valorDois;
        if (valorTres < valorUm && valorTres < valorDois)
            menor = valorTres;

        return (menor * maior) / menor;
    }

}
