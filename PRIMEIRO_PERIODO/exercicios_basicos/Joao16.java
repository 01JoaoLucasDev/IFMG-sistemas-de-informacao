import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 16 - João Lucas da Costa Bernardo
public class Joao16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os minutos: ");
        int totalMinutos = sc.nextInt();

        int horas = totalMinutos / 60;
        int restMinutos = totalMinutos % 60;

        System.out.println("O tempo convertido é: " + horas + " horas e " + restMinutos + " minutos ");
    }
}
