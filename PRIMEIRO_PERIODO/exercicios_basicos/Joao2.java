import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 2 - João Lucas da Costa Bernardo
public class Joao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        int num1 = sc.nextInt();

        int antecessor = num1 - 1;
        int sucessor = num1 + 1;

        System.out.println("O antecessor deste numero é " + antecessor);
        System.out.println("O sucessor deste numero é: " + sucessor);
    }
}
