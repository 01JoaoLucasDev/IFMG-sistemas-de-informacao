package exercicios_basicos;
import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 22 - João Lucas da Costa Bernardo
public class Joao22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int A = sc.nextInt();

        System.out.println("Digite outro numero: ");
        int B = sc.nextInt();

        System.out.printf("Os valores antes da troca são A = " + A + ", e B = " + B );

        int variaveldeTroca = A;
        A = B;
        B = variaveldeTroca;

        System.out.printf(". Após a troca: A = " + A + ", e B = " + B);
    }
}
