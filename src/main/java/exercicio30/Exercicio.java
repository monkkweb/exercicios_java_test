package exercicio30;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        System.out.println("Qaul o numero vc quer saber a tabuada?");
        var numero = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            var tabuada = numero * i;
            System.out.println(tabuada);
        }
    }
}