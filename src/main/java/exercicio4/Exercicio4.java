package exercicio4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] valores = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = entrada.nextInt();
        }

        System.out.println("Valor 1 e Valor 2:");
        System.out.println("	" + valores[0] + " + " + valores[1] + " = " + (valores[0] + valores[1]));
        System.out.println("	" + valores[0] + " * " + valores[1] + " = " + (valores[0] * valores[1]));

        System.out.println("Valor 1 e Valor 3: ");
        System.out.println("	" + valores[0] + " + " + valores[2] + " = " + (valores[0] + valores[2]));
        System.out.println("	" + valores[0] + " * " + valores[2] + " = " + (valores[0] * valores[2]));

        System.out.println("Valor 1 e Valor 4: ");
        System.out.println("	" + valores[0] + " + " + valores[3] + " = " + (valores[0] + valores[3]));
        System.out.println("	" + valores[0] + " * " + valores[3] + " = " + (valores[0] * valores[3]));

        System.out.println("Valor 2 e Valor 3: ");
        System.out.println("	" + valores[1] + " + " + valores[2] + " = " + (valores[1] + valores[2]));
        System.out.println("	" + valores[1] + " * " + valores[2] + " = " + (valores[1] * valores[2]));

        System.out.println("Valor 2 e Valor 4: ");
        System.out.println("	" + valores[1] + " + " + valores[3] + " = " + (valores[1] + valores[3]));
        System.out.println("	" + valores[1] + " * " + valores[3] + " = " + (valores[1] * valores[3]));

        System.out.println("Valor 3 e Valor 4: ");
        System.out.println("	" + valores[2] + " + " + valores[3] + " = " + (valores[2] + valores[3]));
        System.out.println("	" + valores[2] + " * " + valores[3] + " = " + (valores[2] * valores[3]));

    }
}
