package LISTA1_IFMG;
import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 13 - João Lucas da Costa Bernardo
public class Joao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o ano atual: ");
        int anoAtual = sc.nextInt();

        int inicioCopa = 1930;

        int qtdCopas = ((anoAtual - 1930) / 4) - 2;

        System.out.println("A quantidade de copas ja realizadas são: " + qtdCopas + " copas");
    }
}
