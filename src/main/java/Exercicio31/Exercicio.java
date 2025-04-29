package Exercicio31;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        var numero = 0;
        var quantidadePar = 0;
        var quantidadeImpar = 0;

        while (numero >= 0) {

            System.out.print("Digite um número (Mande qualquer numero negativo para finalizar. ): ");
            numero = entrada.nextInt();
            if (numero >= 0) {
                if (numero % 2 == 0) {
                    quantidadePar++;
                } else {
                    quantidadeImpar++;
                }
            }
        }

        System.out.println("Quantidade de Números Pares: " + quantidadePar);
        System.out.println("Quantidade de Números Impares: " + quantidadeImpar);

    }
}