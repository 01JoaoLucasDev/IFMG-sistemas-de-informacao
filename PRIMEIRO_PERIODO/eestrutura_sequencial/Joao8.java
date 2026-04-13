import java.util.Scanner;

public class Joao8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor de x para calcular a função: ");
        double x = sc.nextDouble();

    if (x <= 1) {
        x = 1;
        System.out.println("O valor de f(x) é: " + x);

    } else if (1 < x && x <= 2) {
        x = 2;
        System.out.println("O valor de f(x) é: " + x);

    } else if (2 < x && x <= 3) {
        x = Math.pow(x, 2);
        System.out.println("O valor de f(x) é: " + x);

    } else if (x > 3) {
        x = Math.pow(x, 3);
        System.out.println("O valor de f(x) é: " + x);
    
    } else {
        System.out.println("Valor invalido");
    }
}
}