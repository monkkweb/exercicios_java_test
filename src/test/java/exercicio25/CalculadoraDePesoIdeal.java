package exercicio25;

import lombok.RequiredArgsConstructor;

import java.util.Objects;

@RequiredArgsConstructor
public class CalculadoraDePesoIdeal {

    private final Leitor leitor;
    private final Impressora impressora;

    public void calcular() {
        var sexo = leitor.lerString();
        var altura = leitor.lerNumero();

        if (Objects.equals(sexo, "Feminino")) {
            var pesoIdeal = (62.1 * altura) - 44.7;
            String pesoIdealFormatado = String.format("%.2f", pesoIdeal);
            impressora.imprimir(pesoIdealFormatado + "Kg");
        } else {
            var pesoIdeal = (72.7 * altura) - 58;
            String pesoIdealFormatado = String.format("%.2f", pesoIdeal);
            impressora.imprimir(pesoIdealFormatado + "Kg");
        }

    }

}