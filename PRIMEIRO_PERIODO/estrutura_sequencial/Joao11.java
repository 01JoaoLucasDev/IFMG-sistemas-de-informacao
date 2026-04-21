package estrutura_sequencial;
import java.util.Scanner;

public class Joao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da  Q: ");
        double q = sc.nextDouble();
        
        System.out.print("Digite o valor do  D: ");
        double d = sc.nextDouble();
        
        double n;
        if (d > 100) {
            n = 2;
        } else if (d < 50) {
            n = 6;
        } else {
            n = 4;
        }
        
        double s = (4 * q) / (Math.PI * Math.pow(d, 2)) * n;
        
        System.out.println("O valor da tensão S é: " + s);
        
    }
}
