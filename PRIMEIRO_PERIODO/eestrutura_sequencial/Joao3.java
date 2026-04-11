import java.util.Scanner;

puclic class joao3 {
    psvm(String[] args) {
        Scanner sc = new Scanner(Systen.in);

        System.out.println("Digite o valor de fabrica do carro: ");
        double vrCarro = sc.nextDouble();
        
        if (vrCarro <= 28000) {
            double distribuidor = (vrCarro / 100) * 5;
            double valorFinal1 = vrCarro + distribuidor;
            System.out.println("o valor a ser pago referente ao carro é: " + valorFinal1);

        } else if (vrCarro > 28000.1 && vrCarro <= 450000) {
            double distribuidor = (vrcarro / 100) * 10;
            double vrFinal2 = distribuidor + ((vrCarro / 100) / 15);
            System.out.println("o valor a ser pago referente ao carro é: " + vrFinal2);

        } else if (vrCarro > 45000.00) {
            double distribuidor = (vrCarro / 100) * 15;
            double vrFinal3 = distribuidor + ((vrCarro / 100) / 20);
            System.out.println("o valor a ser pago referente ao carro é: " + vrFinal3);

        } else {
            System.out.println("Valor invalido");
        }
    
}