package estrutura_sequencial_2;

import java.util.Scanner;

public class Joao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("Informe sua altura: ");
        double peso = sc.nextDouble();

        double imc = peso / (Math.pow(altura, 2));

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");

        } else if (imc > 18.5 && imc < 25) {
            System.out.println("Peso normal");

        } else if (imc > 25 && imc < 30) {
            System.out.println("Acima do peso");

        } else if (imc > 30) {
            System.out.println("Obeso");

        } else {
            System.out.println("Valor invalido");
        }

    }
    
}
