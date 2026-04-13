package exercicios_basicos;
import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 11 - João Lucas da Costa Bernardo
public class Joao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o seu salario: ");
        double salario = sc.nextDouble();

        System.out.println("Informe o valor de uma de suas contas a pagar: ");
        double conta1 = sc.nextDouble();

        System.out.println("Informe o valor da sua segunda conta a pagar: ");
        double conta2 = sc.nextDouble();

        double multa1 = (conta1 * 2) / 100;
        double multa2 = (conta2 * 2) / 100;
        double juros = multa1 + multa2;

        double salarioFinal = ((salario - juros) - conta1) - conta2;

        System.out.println("Seu salario é: " + salario);
        System.out.println("O valor a pagar de juros refente a primeira conta é de: " + multa1 + " , e refente" +
                " a segunda conta deverá ser pago o valor de: " + multa2);
        System.out.println("O valor restante a ser recebido do salario é: " +salarioFinal);
    }
}
