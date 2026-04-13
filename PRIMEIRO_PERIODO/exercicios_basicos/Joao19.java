package exercicios_basicos;
import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 19 - João Lucas da Costa Bernardo
public class Joao19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); {

        System.out.println("Insira um numero: ");
        double num = sc.nextInt();

        double quadrado = Math.pow(num, 2);
        double cubo = Math.pow(num, 3);

        double raizQuadrada = Math.sqrt(num);
        double raizCubica = Math.cbrt(num);

        System.out.println(" número digitado elevado ao quadrado equivale á: " + quadrado);
        System.out.println(" número digitado elevado ao cubo equivale á: " + cubo);
        System.out.println(" A raiz quadrada do número equivale á: " + raizQuadrada);
        System.out.println(" A raiz cubica do número equivale á: " + raizCubica);
    }

}}
