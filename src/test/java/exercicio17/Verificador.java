package exercicio17;

public class Verificador {
    public String verificar(int valor) {
        if (valor >= 0 && valor <= 9)
            return "Valor valido";
        else return "Valor invalido";
    }
}
