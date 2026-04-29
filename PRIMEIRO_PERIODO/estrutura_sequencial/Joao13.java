package estrutura_sequencial;
import java.util.Scanner; 

// IFMG - Campus Sabará
// EXERCICIO 13 - João Lucas da Costa Bernardo
public class Joao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        double a = sc.nextDouble();

        System.out.print("Digite o lado B: ");
        double b = sc.nextDouble();

        System.out.print("Digite o lado C: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Forma um triângulo!");

            if (a == b && b == c) {
                System.out.println("Tipo: Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Tipo: Isósceles");
            } else {
                System.out.println("Tipo: Escaleno");
            }

        } else {
            System.out.println("Não forma um triângulo.");
        }

        sc.close();
    }
}