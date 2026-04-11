// IFMG - Campus Sabará
// EXERCICIO 1 - João Lucas da Costa Bernardo

import java.util.Scanner;
public class Joao1 {
    public static void main(String[] args) {
        

    Scanner sc = new Scanner(System.in);

   System.out.println("Informe a sua idade: ");
   int idade = sc.nextInt();

   if (idade >= 5 && idade <= 7) {
        System.out.println("categoria: infantil");

   } else if (idade >= 8 && idade <= 10 ) {
        System.out.println("categoria: juvenil");

    } else if (idade >= 11 && idade <= 15) {
            System.out.println("categoria: adolescente");

    } else if (idade >= 16 && idade <= 40 ) {
                System.out.println("categoria: Adulto");

    } else if (idade > 40) {
            System.out.println("categoria: senior");

    } else {
        System.out.println("Idade Invalida")
    }
    
   }
    
}


