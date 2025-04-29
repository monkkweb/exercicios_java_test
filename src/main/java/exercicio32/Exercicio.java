package exercicio32;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        var resultado = 0;

        do {
            System.out.print("Digite um número maior que 0 e menor que 10: ");
            numero = entrada.nextInt();
        } while (numero <= 0 || numero >= 10);

        for (int x = numero; x < 40 + numero; x++) {
            if (x % 2 == 1) {
                resultado += x * x;
            }
        }
        System.out.println("O resultado da soma dos quadrados dos 20 primeiros números inteiros positivos ímpares a partir do número informado é: " + resultado);

    }
}