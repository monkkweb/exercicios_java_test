package exercicio25;

import lombok.AllArgsConstructor;
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
            String pesoIdealFormatado = String.format("%.2f", pesoIdeal);
            impressora.imprimir(pesoIdealFormatado + "Kg");
        } else {
            pesoIdeal = (72.7 * altura) - 58;
            String pesoIdealFormatado = String.format("%.2f", pesoIdeal);
            impressora.imprimir(pesoIdealFormatado + "Kg");
        }

    }

}