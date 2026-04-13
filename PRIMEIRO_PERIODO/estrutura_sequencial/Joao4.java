package estrutura_sequencial;
import java.util.Scanner;

public class Joao4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Veja as contas que a calculadora pode fazer: ");

        System.out.print("1 - Soma \n2 - Subtração \n3 - Multiplicação \n4 - Divisão");

        System.out.print("\n Selecione a conta que voce deseja realizar de acordo com o numero: ");
        int selectNum = sc.nextInt();

        System.out.println("Agora que voce viu as conbtas que a calculadora pode fazer, digite o primeiro numero: ");
        double num1 = sc.nextDouble();

         System.out.println("Digite um numero:");

        System.out.println("Agora digite o segundo numero: ");
        double num2 = sc.nextDouble();

        if (selectNum == 1) {
            double soma = num1 + num2;
            System.out.println("O resultado da soma é: " + soma);
        } else if (selectNum == 2) {
            double subtracao = num1 - num2;
            System.out.println("O resultado da subtração é: " + subtracao);
        } else if (selectNum == 3) {
            double multiplicacao = num1 * num2;
            System.out.println("O resultado da multiplicação é: " + multiplicacao);
        } else if (selectNum == 4) {
            double divisao = num1 / num2;
            System.out.println("O resultado da divisão é: " + divisao);
        } else if (selectNum == 5) {
            System.out.println("Saindo...");
        } else {
            System.out.println("Opção invalida");
        }
    }
}