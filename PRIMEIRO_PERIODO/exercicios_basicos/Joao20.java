package exercicios_basicos;
import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 20 - João Lucas da Costa Bernardo
public class Joao20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número de horas trabalhadas: ");
        double horasTrabalhadas = sc.nextDouble();

        System.out.println("Informe o valor do salário mínimo: ");
        double salarioMinimo = sc.nextDouble();

        System.out.println("Informe o número de horas extras trabalhadas: ");
        double horasExtras = sc.nextDouble();

        double valordeHoras = 0.125 * salarioMinimo;
        double valorhorasExtras = 0.25 * salarioMinimo;

        double salariobruto = horasTrabalhadas * valordeHoras;
        double totalExtras = horasExtras * valorhorasExtras;

        double vReceber = salariobruto + totalExtras;

        System.out.printf("O valor a receber equivale a:  %.2f%n", vReceber);
    }
}
