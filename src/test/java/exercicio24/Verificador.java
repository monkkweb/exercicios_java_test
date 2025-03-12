package exercicio24;

import lombok.RequiredArgsConstructor;

import java.util.Objects;

@RequiredArgsConstructor
public class Verificador {

    private final Leitor leitor;
    private final Impressora impressora;

    public void verificar() {
        String resposta;
        var primeiroNumero = leitor.lerNumero();
        var segundoNumero = leitor.lerNumero();

        do {
            resposta = leitor.lerString();
            if (Objects.equals(resposta, "1")) {
                if (primeiroNumero % segundoNumero == 0 || segundoNumero % primeiroNumero == 0)
                    impressora.imprimir("Numero é multiplo!");
                else impressora.imprimir("Não é multiplo!");
            }

            if (Objects.equals(resposta, "2")) {
                if (primeiroNumero % 2 == 0 && segundoNumero % 2 == 0)
                    impressora.imprimir("Os valores são pares!");
                else impressora.imprimir("Os valores são impares!");

            }

            if (Objects.equals(resposta, "3")) {
                var media = (primeiroNumero + segundoNumero) / 2;
                if (media == 7)
                    impressora.imprimir("Igual á 7!");
                else if (media > 7)
                    impressora.imprimir("Maior que 7!");
                else impressora.imprimir("Menor que 7!");
            }
        }
        while (Objects.equals(resposta, "4"));

    }
}
