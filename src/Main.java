import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner leitor = new Scanner(System.in);
//        int cont = 0;
//        double soma = 0;
//        double n = 0;
//
//        while (n >= 0) {
//            n = leitor.nextInt();
//            if (n < 0) {
//                cont++;
//                soma+=n;
//            }
//        }
//        double media = soma / cont;
//        System.out.println(String.format("%.2f", media));

        /**
         * 34
         * 56
         * 44
         * 23
         * -2
         * */

        Scanner entrada = new Scanner(System.in);
        float idade, soma = 0,cont = 0, media;
        do {
            idade = entrada.nextFloat();
            if (idade >= 0) {
                soma += idade;
                cont += 1;
            }
        } while (idade >= 0);

        media = (soma / cont);

        System.out.printf("%.2f\n",media);
    }
}
