package estrutura_sequencial;
import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 15 - João Lucas da Costa Bernardo
public class Joao15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 4 dígitos: ");
        int num = sc.nextInt();

        if (num < 1000 || num > 9999) {
            System.out.println("Número inválido! Deve ter 4 dígitos.");
        } else {
            int d1 = num / 1000;
            int d2 = (num / 100) % 10;
            int d3 = (num / 10) % 10;
            int d4 = num % 10;

            if ((d1 == 0 || d1 == 1) &&
                (d2 == 0 || d2 == 1) &&
                (d3 == 0 || d3 == 1) &&
                (d4 == 0 || d4 == 1)) {

                int decimal = d1 * 8 + d2 * 4 + d3 * 2 + d4 * 1;

                System.out.println("Número binário válido!");
                System.out.println("Equivalente em decimal: " + decimal);

            } else {
                System.out.println("O número não é binário.");
            }
        }

        sc.close();
    }
}