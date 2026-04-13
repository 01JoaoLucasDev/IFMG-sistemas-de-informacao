package exercicios_basicos;
import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 15 - João Lucas da Costa Bernardo
public class Joao15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.1416;

        System.out.println("Informe o valor do raio da circunferencia: ");
        double raio = sc.nextDouble();

        double areaC = pi * Math.pow(raio, 2);

        System.out.println("O valor da area é: " + areaC);
    }
}
