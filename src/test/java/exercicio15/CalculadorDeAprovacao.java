package exercicio15;

public class CalculadorDeAprovacao {

    public String calcular(double notaUm, double notaDois, double notaTres, double notaQuatro, double notaDeRecuperacao) {
        var mediaDasNotas = (notaUm + notaDois + notaTres + notaQuatro) / 4;
        if (mediaDasNotas >= 7)
            return "Aprovado";
        else {
            var mediaComNotaDeRecuperacao = notaDeRecuperacao + mediaDasNotas;
            if (mediaComNotaDeRecuperacao >= 7)
                return "Aprovado";
            else
                return "Reprovado";
        }

    }
}
