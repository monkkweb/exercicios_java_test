package calculadora;

import lombok.RequiredArgsConstructor;

import java.util.Objects;

@RequiredArgsConstructor
public class Calculadora {
    private final Leitor leitor;
    private final Impressora impressora;

    void calcular() {
        var valorUm = leitor.lerNumero();
        var valorDois = leitor.lerNumero();
        var operador = leitor.lerString();
        if (Objects.equals(operador, "-"))
            impressora.imprimir(negativo(valorUm, valorDois));
        if (Objects.equals(operador, "+")) {
            impressora.imprimir(positivo(valorUm, valorDois));
        }
        if (Objects.equals(operador, "/"))
            impressora.imprimir(divisao(valorUm, valorDois));
        if (Objects.equals(operador, "*"))
            impressora.imprimir(multiplicacao(valorUm, valorDois));
    }

    private double multiplicacao(double valorUm, double valorDois) {
        return valorUm * valorDois;
    }

    private double divisao(double valorUm, double valorDois) {
        return valorUm / valorDois;
    }

    private double positivo(double valorUm, double valorDois) {
        return valorUm + valorDois;
    }

    private double negativo(double valorUm, double valorDois) {
        return valorUm - valorDois;
    }
}