package exercicio16;

public class DetectorDeNumeros {
    public String detectar(double valorUm, double valorDois) {
        if (valorUm > valorDois)
            return "O primeiro valor é o maior!";
        if (valorUm == valorDois)
            return "Os valores são iguais!";
        else return "O segundo valor é o maior!";
    }
}
