package LISTA1_IFMG;
import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 5 - João Lucas da Costa Bernardo
public class Joao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o seu salario: ");
        double salario = sc.nextDouble();

        double gratificacao = salario * 10 / 100;
        double ajusteSalarial = salario + gratificacao;
        double desconto = ajusteSalarial * 5 / 100;

        double salarioReceber = ajusteSalarial - desconto;

        System.out.println("Sua gratificação equivale a: " + gratificacao);
        System.out.println("Será descontado do seu salario o valor de: " +desconto);
        System.out.println("Voce receberá um total de: " + salarioReceber + "reais");
    }
}
