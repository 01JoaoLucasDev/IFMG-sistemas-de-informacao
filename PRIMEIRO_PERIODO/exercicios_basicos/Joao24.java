import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 24 - João Lucas da Costa Bernardo
public class Joao24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o valor de a para realizar a equuação de segundo grau: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = sc.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta < 0) {
            System.out.println("O valor de delta é: " + delta + ". Logo, a conta não pode ser realizada pois o delta sendo " +
                    "menor que 0, não existira raizes reais na equação");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Delta: "+ delta);
            System.out.println("Raiz do primeiro x: " + x1);
            System.out.println("Raiz do segundo x: " +x2);
        }


    }


}
