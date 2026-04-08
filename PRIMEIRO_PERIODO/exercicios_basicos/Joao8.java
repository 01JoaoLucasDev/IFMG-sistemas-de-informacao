import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 8 - João Lucas da Costa Bernardo
public class Joao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor medio a ser pago neste terreno por metro quadrado: ");
        double vrTerreno = sc.nextDouble();

        System.out.println("Levando em con sideração que o terreno tem formato de um trapezio, Informe o valor da base maior do trapezio: ");
        double baseMaior = sc.nextDouble();

        System.out.println("Informe o valor da base menor: ");
        double baseMenor = sc.nextDouble();

        System.out.println("informe o valor da altura do trapezio: ");
        double altura = sc.nextDouble();

        double areaTerreno = ((baseMaior + baseMenor) * altura) / 2;
        double valorMedio = vrTerreno * areaTerreno;

        System.out.println("A area do terreno é: " + areaTerreno + " metros quadrados");
        System.out.println("O valor medio a ser pago pelo terreno é: " + valorMedio + " mil");


    }
}
