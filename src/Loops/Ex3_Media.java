package Loops;

import java.util.Scanner;

public class Ex3_Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, count = 0, maior = 0, soma = 0;


        do {
            System.out.println("Numero: ");
            num = input.nextInt();

            soma = soma + num;

            if (num > maior) maior = num;

            count = count + 1;

        } while (count < 5);
        System.out.println("Maior: " + maior);
        System.out.println("Soma: " + (soma / 5));
    }
}
