package exercicios_basicos;
import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 6 - João Lucas da Costa Bernardo
public class Joao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu salario fixo: ");
        double salarioFixo = sc.nextDouble();
        System.out.println("Qual o valor de vendas voce realizou no mes? ");
        double vendas = sc.nextInt();

        double comissao = vendas * 4 / 100;

        double salarioFinal = salarioFixo + comissao;

        System.out.println("O seu beneficio de acordo com o valor de vendas realizado é: " + comissao);
        System.out.println("O salario que voce irá receber é: " + salarioFinal);
    }
}
