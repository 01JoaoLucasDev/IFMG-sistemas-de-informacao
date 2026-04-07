package LISTA1_IFMG;

import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 12 - João Lucas da Costa Bernardo
public class Joao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a medida da rua A: ");
        double ruaA = sc.nextDouble();;

        System.out.println("informe a medida da rua B: ");
        double ruaB = sc.nextDouble();

        System.out.println("Qual a sua meta de voltas diarias no quarteirão? ");
        int meta = sc.nextInt();

        double ruaC = Math.sqrt(Math.pow(ruaA, 2) + Math.pow(ruaB, 2));

        double perimetro = ruaA = ruaB + ruaC;

        double metaM = meta * 1000;

        double tVoltas = metaM / perimetro;

        System.out.println("Voce precisa de " + tVoltas + "para completar o percurso! ");


    }

}
