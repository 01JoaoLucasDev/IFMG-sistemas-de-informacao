import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 18 - João Lucas da Costa Bernardo
public class Joao18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do salário mínimo: ");
        double salarioMinimo = sc.nextDouble();

        System.out.print("Informe a quantidade de quilowatts consumidos: ");
        double Quilowatt = sc.nextDouble();


        double valorPorQuilowatt = salarioMinimo / 5;


        double valorTotal = valorPorQuilowatt * Quilowatt;


        double valorComDesconto = valorTotal * 0.85;


        System.out.printf("Valor de cada quilowatt: R$ %.2f\n", valorPorQuilowatt);
        System.out.printf("Valor total do consumo: R$ %.2f\n", valorTotal);
        System.out.printf("Valor com 15%% de desconto: R$ %.2f\n", valorComDesconto);

        sc.close();
    }
}