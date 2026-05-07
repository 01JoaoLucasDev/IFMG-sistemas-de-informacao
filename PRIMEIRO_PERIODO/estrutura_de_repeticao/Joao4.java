package estrutura_de_repeticao;
import java.util.Scanner;

public class Joao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Informe um numero: ");
            numero = sc.nextInt();

            if (numero != -999) {
                int result = numero * 3;
                System.out.println("O resultado é: " + result);
            }
        } while (numero != -999); 

     sc.close();
    }
}
