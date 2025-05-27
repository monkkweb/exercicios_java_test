package exercicio41;

public class ClassificadorDeIdade {

    public String classificar(double idade) {
        if (idade >= 5 && idade <= 7)
            return "Infantil A";
        if (idade >= 8 && idade <= 11)
            return "Infantil B";
        if (idade >= 12 && idade <= 13)
            return "Juvenil A";
        if (idade >= 14 && idade <= 17)
            return "Juvenil B";
        if (idade >=18 )
            return "Adulto";

        return "Não definido";
    }

}
