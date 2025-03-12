package exercici23;

import java.util.Objects;
import java.util.Scanner;

public class Calaculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorUm;
        double valorDois;
        String operador;

        System.out.println("digite um valor para ser calculador: ");
        valorUm = scan.nextDouble();

        System.out.println("Digite o segundo Valor: ");
        valorDois = scan.nextDouble();

        System.out.println("Qual operado sera usado: ");
        operador = scan.next();
        if (Objects.equals(operador, "-"))
            System.out.println(valorUm - valorDois);
        if (Objects.equals(operador, "+"))
            System.out.println(valorUm + valorDois);
        if (Objects.equals(operador, "*"))
            System.out.println(valorUm * valorDois);
        if (Objects.equals(operador, "/"))
            System.out.println(valorUm / valorDois);
    }
}
