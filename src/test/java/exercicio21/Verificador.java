package exercicio21;

import lombok.RequiredArgsConstructor;

import java.util.Objects;

@RequiredArgsConstructor
public class Verificador {
    private final Leitor leitor;
    private final Impressora impressora;

    public void verificar() {
        String resposta;
        do {
            var valor = leitor.lerNumero();

            if (valor < 0)
                impressora.imprimir("Negativo!");

            else impressora.imprimir("Positivo!");

            impressora.imprimir("Outro valor?");
            resposta = leitor.lerString();

        } while (Objects.equals(resposta, "Sim"));
    }
}
