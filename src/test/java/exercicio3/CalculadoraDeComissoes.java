package exercicio3;

public class CalculadoraDeComissoes {
    public double calcular(double valorDaPeca, double quantidadeVendida) {
        var percentualDaComissao = 0.05;

        return (valorDaPeca * quantidadeVendida) * percentualDaComissao;
    }
}