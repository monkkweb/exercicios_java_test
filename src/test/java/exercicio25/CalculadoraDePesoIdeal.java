package exercicio25;

import lombok.RequiredArgsConstructor;

import java.util.Objects;

@RequiredArgsConstructor
public class CalculadoraDePesoIdeal {

    private final Leitor leitor;
    private final Impressora impressora;

    public void calcular() {
        double pesoIdeal;
        var sexo = leitor.lerString();
        var altura = leitor.lerNumero();

        if (Objects.equals(sexo, "Feminino")) {
            pesoIdeal = (62.1 * altura) - 44.7;
            String result = String.format("%.2f", pesoIdeal);
            impressora.imprimir(result + "Kg");
        } else {
            pesoIdeal = (72.7 * altura) - 58;
            String result = String.format("%.2f", pesoIdeal);
            impressora.imprimir(result + "Kg");
        }

    }

}
