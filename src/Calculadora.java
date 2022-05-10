public class Calculadora {
    // Método que realiza soma
    public static void soma(double num1, double num2) {
        double resultado = num1 + num2;
        System.out.println("A soma de " + num1 + " mais " + num2 + " é " + resultado);
    }

    // Método que realiza subtração
    public static void sub(double num1, double num2) {
        double resultado = num1 - num2;
        System.out.println("A subtração de " + num1 + " menos " + num2 + " é " + resultado);
    }

    // Método que realiza multiplicação
    public static void multiplicacao(double num1, double num2) {
        double resultado = num1 * num2;
        System.out.println("A multiplicação de " + num1 + " vezes " + num2 + " é " + resultado);
    }

    // Método que realiza divisão
    public static void divisao(double num1, double num2) {
        double resultado = num1 / num2;
        System.out.println("A divisão de " + num1 + " dividido " + num2 + " é " + resultado);
    }
}
