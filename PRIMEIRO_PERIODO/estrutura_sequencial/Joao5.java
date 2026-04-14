package estrutura_sequencial;
import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 5 - João Lucas da Costa Bernardo
public class Joao5 {
    public static void main (String[] args) {
     System.out.println("Digite uma letra:") ;
     Scanner sc = new Scanner(System.in);

        char letra = sc.nextLine().charAt(0);
        letra = Character.toUpperCase(letra);
        
        if (letra == 'A' || letra == 'E'|| letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("A letra é uma vogal");
        } else {
            System.out.println("A letra é uma consoante");
        }
    }
}