package estrutura_sequencial;
import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 16 - João Lucas da Costa Bernardo
public class Joao16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        if (ano <= 0) {
            System.out.println("Digite um ano positivo!");
        } else {
            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                System.out.println("Ano bissexto!");
            } else {
                System.out.println("Não é bissexto.");
            }
        }

        sc.close();
    }
}