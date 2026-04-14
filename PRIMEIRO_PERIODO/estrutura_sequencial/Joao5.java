package estrutura_sequencial;
import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 5 - João Lucas da Costa Bernardo
public class Joao5 {
    public static void main (String[] args) {
     System.out.println("Digite uma letra:") ;
     Scanner sc = new Scanner(System.in);

        String letra = sc.nextLine().charAt(0);
        letra = Character.toUpperCase();
        
        if (letra.equals("a") || Letra.equals("e") || letra.equals(i) || letra.equals(0) || letra.equals(u)) {
            System.out.println("A letra é uma vogal");
        } else {
            System.out.println("A letra é uma consoante");
        }
    }
}