package exercicios_basicos;
import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 1 - João Lucas da Costa Bernardo
public class Joao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = sc.nextInt();
        System.out.println("Digite outro número: ");
        int num3 = sc.nextInt();

        int soma = num1 + num2 + num3;
        int media = (num1 + num2 + num3) / 3;

        System.out.println("A soma dos numeros é: " + soma);
        System.out.println("A media ponderada dos números é: " + media);
    }
}
