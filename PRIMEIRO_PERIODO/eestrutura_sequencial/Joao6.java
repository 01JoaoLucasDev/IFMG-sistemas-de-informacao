import java.util.Scanner;

public class Joao6 {
    public static void main args (String[] args) {
        system.out.printlm("Informe o seu salario:");
        double salario = sc.mextDiouble();

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