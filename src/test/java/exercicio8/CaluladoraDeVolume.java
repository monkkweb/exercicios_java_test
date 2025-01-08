package exercicio8;

public class CaluladoraDeVolume {
    private static final double VALOR_DE_PI = 3.14159;

    public String calcular(double raio, double altura) {
        double resultado = VALOR_DE_PI * (raio * raio) * altura;
        return String.format("%.2f", resultado) + " cm³";
    }
}
