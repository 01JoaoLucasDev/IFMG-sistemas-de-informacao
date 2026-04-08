import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 21 - João Lucas da Costa Bernardo
public class Joao21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Informe o ângulo formado pela escada com o chão. Deve estar em graus: ");
        double aGraus = sc.nextDouble();

        System.out.print("Informe a altura da parede: ");
        double altParede = sc.nextDouble();


        double anguloRadianos = Math.toRadians(aGraus);


        double medidaEscada = altParede / Math.sin(anguloRadianos);


        System.out.println("A medida da escada deve ser: " + medidaEscada);

    }
}