package LISTA1_IFMG;

import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 4 - João Lucas da Costa Bernardo
public class Joao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.println("Informe a sua primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("informe a sua segunda nota: ");
        double nota2 = sc.nextByte();

        System.out.println("Informe a sua terceira nota: ");
        double nota3 = sc.nextByte();

        double mediaNOTAS = (nota1 + nota2 + nota3) / 3;

        System.out.println("A swua media é: " +mediaNOTAS);
    }
}
