package Loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantNumeros, numero, quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de Numeros: ");
        quantNumeros = input.nextInt();

        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = input.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;

        }while (count < quantNumeros);

        System.out.println("quantridade par: " + quantPares);
        System.out.println("quantridade impar: " + quantImpares);
    }
}
