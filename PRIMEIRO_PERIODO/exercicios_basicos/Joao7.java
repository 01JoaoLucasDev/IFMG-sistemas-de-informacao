package LISTA1_IFMG;
import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 7 - João Lucas da Costa Bernardo
public class Joao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Levando em consideração um retangulo, por favor, informe o valor de um dos lados do retangulo: ");
        double l1 = sc.nextDouble();
        System.out.println("Informe o valor da altura do retangulo: ");
        double A1 = sc.nextDouble();

        double perimetro = (l1 * 2) + (A1 * 2);
        double area = l1 * A1;

        System.out.println("O perimetro do retangulo é: " + perimetro);
        System.out.println("A area do retangulo é: " + area);
    }
}
