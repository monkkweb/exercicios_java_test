package exercicio5;

public class CalculadoraDeLitrosGastosDeCombustivel {
    private static final int QUANTIDADE_DE_LITRO_QUE_FAZ_POR_KM = 12;

    public double calcular(double velocidade, double tempoPercorridoPorMinutos) {
        var distancia = velocidade * tempoPercorridoPorMinutos;
        return distancia /  QUANTIDADE_DE_LITRO_QUE_FAZ_POR_KM;
    }
}
