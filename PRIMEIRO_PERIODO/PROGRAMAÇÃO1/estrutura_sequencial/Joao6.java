package estrutura_sequencial;
import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 6 - João Lucas da Costa Bernardo
public class Joao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o seu salario:");
        double salario = sc.nextDouble();

        if (salario < 700) {
            double aumento = (salario / 100) * 30;
            double salarioFinal = salario + aumento;
            System.out.println("Salarios abaixo de 700 reais recebem um aumento de 30%. então, o seu salario final é: " + salarioFinal);

        } else if (salario >= 700) {
            double aumento = (salario / 100) * 10;
            double salarioFinal = salario + aumento;
            System.out.println("Salarios acima de 700 reais recebem um aumento de 15%. então, o seu salario final é: " + salarioFinal);

        } else {
            System.out.println("Valor invalido");
        }
    }
}