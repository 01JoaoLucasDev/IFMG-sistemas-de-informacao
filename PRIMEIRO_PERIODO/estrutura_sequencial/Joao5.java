
package estrutura_sequencial;
import java.util.Scanner;

public class Joao5 {
    public static void main (String[] args) {
     System.out.println("Digite uma letra:") ;
     Scanner sc = new Scanner(System.in);
        String letra = sc.nextLine();
        if (letra == "a" || letra == "A" || letra == "e" || letra == "E" || letra == "i" || letra == "I" || letra == "o" || letra == "O" || letra == "u" || letra == "U") {
            System.out.println("A letra é uma vogal");
        } else {
            System.out.println("A letra é uma consoante");
        }
    }
}