package exercicios_basicos;
import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 14 - João Lucas da Costa Bernardo
public class Joao14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a largura de um comodo: ");
        double largura = sc.nextDouble();

        System.out.println("Informe o comprimento de um comodo: ");
        double comprimento = sc.nextDouble();

        double areaComodo = largura * comprimento;

        double iluminacao = areaComodo * 18;

        System.out.println("A area do comodo equivale á: " + areaComodo + " metros quadrados");
        System.out.println("A iluminação necessaria para iluminar corretamente o comodo é: " + iluminacao + " W");
    }
}
