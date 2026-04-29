package estrutura_sequencial;
import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 12 - João Lucas da Costa Bernardo
public class Joao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Data da votação:");
        System.out.print("Dia: ");
        int diaV = sc.nextInt();
        System.out.print("Mês: ");
        int mesV = sc.nextInt();
        System.out.print("Ano: ");
        int anoV = sc.nextInt();

        System.out.println("\nData de nascimento:");
        System.out.print("Dia: ");
        int diaN = sc.nextInt();
        System.out.print("Mês: ");
        int mesN = sc.nextInt();
        System.out.print("Ano: ");
        int anoN = sc.nextInt();

        int idade = anoV - anoN;

        if (mesV < mesN || (mesV == mesN && diaV < diaN)) {
            idade--;
        }

        if (idade < 16) {
            System.out.println("\nIdade: " + idade + " -> Não vota");
        } else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("\nIdade: " + idade + " -> Voto facultativo");
        } else {
            System.out.println("\nIdade: " + idade + " -> Voto obrigatório");
        }

        sc.close();
    }
}
