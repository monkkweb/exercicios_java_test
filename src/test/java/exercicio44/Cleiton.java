package exercicio44;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Cleiton {
    private final Leitor leitor;
    private final Impressora impressora;

    void executar() {
        var opcao = leitor.ler();
        var valor = leitor.ler();

        if (opcao == 1) {
            var grausFahrenheit = (9 * valor + 160) / 5;
            impressora.imprimir(grausFahrenheit, "F");
        }
        if (opcao == 2) {
            var grausCelsius = (valor - 32) * 5 / 9;
            impressora.imprimir(grausCelsius, "C");
        }
        if (opcao == 3) {
            var pesoIdealMascculino = (72.7 * valor) - 58;
            impressora.imprimir(pesoIdealMascculino, "Kg");
        }
        if (opcao == 4) {
            var pesoIdealFeminino = (62.1 * valor) - 44.7;
            impressora.imprimir(pesoIdealFeminino, "Kg");
        }

    }
}
