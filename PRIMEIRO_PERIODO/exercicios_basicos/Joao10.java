package LISTA1_IFMG;

// IFMG - Campus Sabará
// EXERCICIO 10 - João Lucas da Costa Bernardo
public class Joao10 {
    public static void main(String[] args) {

        double deposito = 2000.00;
        double taxa = 0.005;
        int meses = 24;
        double montante = deposito * Math.pow((1 + taxa), meses);

        System.out.println("O valor depositado renderá o valor de: " + montante);


    }
}
