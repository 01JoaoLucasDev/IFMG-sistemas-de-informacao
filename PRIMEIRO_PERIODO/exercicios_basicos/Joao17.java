import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 17 - João Lucas da Costa Bernardo
public class Joao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número real: ");
        double num = sc.nextDouble();

        int pInteira = (int) num;

        double pFracionaria = num - pInteira;

        System.out.println("Parte inteira: " + pInteira);

        System.out.printf("Parte fracionária: %.2f\n", pFracionaria);
    }
}
