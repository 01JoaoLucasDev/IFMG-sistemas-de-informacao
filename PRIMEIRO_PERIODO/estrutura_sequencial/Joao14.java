package estrutura_sequencial;
import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 14 - João Lucas da Costa Bernardo
public class Joao14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 3 dígitos: ");
        int num = sc.nextInt();

        if (num < 100 || num > 999) {
            System.out.println("Número inválido! Digite um número de 3 dígitos.");
        } else {
            int centena = num / 100;
            int dezena = (num / 10) % 10;
            int unidade = num % 10;

            int invertido = unidade * 100 + dezena * 10 + centena;

            if (num == invertido) {
                System.out.println("É palíndromo!");
            } else {
                System.out.println("Não é palíndromo.");
            }
        }

        sc.close();
    }
}