package exercicio44;

import java.util.Objects;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        String resposta;

        System.out.println("1– Conversão de Graus Celsius em Graus Fahrenheit \n" +
                "2 – Conversão de Graus Fahrenheit em Graus Celsius \n" +
                "3 – Peso ideal do homem \n" +
                "4 – Peso ideal da mulher ");
        resposta = scan.next();

        if (Objects.equals(resposta, "1")) {
            System.out.print("Quantos grasus Celsius: ");
            var grausCelsius = scan.nextDouble();
            var conversor = (9 * grausCelsius + 160) / 5;
            System.out.println("Conversão para graus Fahrenheit: " + conversor);
        }

        if (Objects.equals(resposta, "2")) {
            System.out.print("Quantos grasus Fahrenheit: ");
            var grausFahrenheit = scan.nextDouble();
            var conversor = (grausFahrenheit - 32) * 5 / 9;
            var conversorFormatado = String.format("%.2f", conversor);
            System.out.println("Conversão para graus Fahrenheit: " + conversorFormatado);
        }

    }
}