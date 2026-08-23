package estrutura_sequencial;
import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 19 - João Lucas da Costa Bernardo
public class Joao19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário base: ");
        double salario = sc.nextDouble();

        System.out.print("Digite o tempo de serviço (anos): ");
        int tempo = sc.nextInt();

        double imposto;
        if (salario < 200) {
            imposto = 0;
        } else if (salario <= 450) {
            imposto = salario * 0.03;
        } else if (salario < 700) {
            imposto = salario * 0.08;
        } else {
            imposto = salario * 0.12;
        }

        double gratificacao;
        if (salario > 500) {
            if (tempo <= 3) {
                gratificacao = 20;
            } else {
                gratificacao = 30;
            }
        } else {
            if (tempo <= 3) {
                gratificacao = 23;
            } else if (tempo <= 6) {
                gratificacao = 35;
            } else {
                gratificacao = 33;
            }
        }

        double salarioLiquido = salario - imposto + gratificacao;

        String classificacao;
        if (salarioLiquido <= 350) {
            classificacao = "A";
        } else if (salarioLiquido <= 600) {
            classificacao = "B";
        } else {
            classificacao = "C";
        }

        System.out.println("\nImposto: R$ " + imposto);
        System.out.println("Gratificação: R$ " + gratificacao);
        System.out.println("Salário líquido: R$ " + salarioLiquido);
        System.out.println("Classificação: " + classificacao);

        sc.close();
    }
}