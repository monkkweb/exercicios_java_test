package exercicio14;

public class Diferenciador {
    public double diferenciar(double valorUm, double valorDois) {
        if (valorUm >= valorDois)
            return valorUm - valorDois;
        else
            return valorDois - valorUm;
    }
}
