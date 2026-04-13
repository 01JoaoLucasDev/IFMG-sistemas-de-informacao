import java.util.Scanner;

public class Joao7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o valor do carro a ser transferido:");
        double valorCarro = sc.nextDouble();

        System.out.println("Informe o ano do carro: ");
        int anoCarro = sc.nextInt();

        if (anoCarro < 1990) {
            double imposto = ( valorCarro / 100 )* 1;
            System.out.println("O imposto a ser pago é: " + imposto);
           
        } else if (anoCarro >= 1990) {
            double imposto = (valorCarro / 100) * 1.5;
            System.out.println("O imposto a ser pago é: " + imposto);

        } else {
            System.out.println("Valor invalido");
        }

    } 
}