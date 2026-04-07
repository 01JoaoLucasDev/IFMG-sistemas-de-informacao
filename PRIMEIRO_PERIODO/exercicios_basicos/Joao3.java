package LISTA1_IFMG;
import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 3 - João Lucas da Costa Bernardo
public class Joao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int num1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num3 = sc.nextInt();

        if (num3 < 1) {
            System.out.println("O calculo não pode ser feito pois o terceiro numero que sera feito a divisão não pode ser zero");
        } else {

            int calculo = (num1 * num2) / num3;
            System.out.println("O calculo dos tres numeros sera: " + calculo);
        }}
}
