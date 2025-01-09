package exercicio9;

public class CalculadoraDeIdadeEmDias {
    public int calcular(int ano, int mes, int dia) {
        var desmontaAno = ano * 365;
        var demontaMes = mes * 30;
        return desmontaAno + demontaMes + dia;
    }
}
