import java.util.Scanner;

pubiic class Joao7 {
    public static void main (String[] args) {
        System.out.println("informe o valor do carro a ser transferido:");
        double valorCarro = sc.nextdouble();

        System.out.println("Informe o ano do carro: ");
        int anoCarro = sc.nextInt();

        if (anoCarro < 1990) {
            double imposto = ( valorcarro / 100 )* 1;
            System.out.println("O imposto a ser pago é: " + imposto);
           
        } else if (anoCarro >= 1990) {
            double imposto = (valorCarro / 100) * 1.5;
            System.out.println("O imposto a ser pago é: " + imposto);

        } else {
            System.out.println("Valor invalido");
        }

    } 
}