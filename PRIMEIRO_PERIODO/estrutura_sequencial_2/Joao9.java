package estrutura_sequencial_2;
import java.util.Scanner;

public class Joao9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Digite o valor de a: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = sc.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c = sc.nextDouble();

       
        if (a == 0) {
            System.out.println("Não é uma equação do 2º grau.");
            
            if (b == 0) {
                System.out.println("Não é uma equação do 1º grau.");
            } else {
                double r = -c / b;
                System.out.println("Raiz da equação do 1º grau (r): " + r);
            }
        } else {
        
            double d = (b * b) - (4 * a * c);

            if (d < 0) {
                System.out.println("Não há raízes reais.");
            } else {
            
                double r1 = (-b - Math.sqrt(d)) / (2 * a);
                double r2 = (-b + Math.sqrt(d)) / (2 * a);
                
                System.out.println("As raízes são: r1: " + r1 + ", e r2: " + r2);
            }
        }

        System.out.println("fim");
    }
}