package estrutura_sequencial;
import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 17 - João Lucas da Costa Bernardo
public class Joao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c = sc.nextInt();

        int menor, meio, maior;

        if (a <= b && a <= c) {
            menor = a;
            if (b <= c) {
                meio = b;
                maior = c;
            } else {
                meio = c;
                maior = b;
            }
        } else if (b <= a && b <= c) {
            menor = b;
            if (a <= c) {
                meio = a;
                maior = c;
            } else {
                meio = c;
                maior = a;
            }
        } else {
            menor = c;
            if (a <= b) {
                meio = a;
                maior = b;
            } else {
                meio = b;
                maior = a;
            }
        }

        System.out.println("\nOrdem crescente: " + menor + " " + meio + " " + maior);
        System.out.println("Ordem decrescente: " + maior + " " + meio + " " + menor);

        sc.close();
    }
}