package estrutura_sequencial;
import java.util.Scanner;

// IFMG - Campus Sabará
// EXERCICIO 18 - João Lucas da Costa Bernardo
public class Joao18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();

        double preco = 0;

        if (codigo >= 1 && codigo <= 10) {
            preco = 10;
        } else if (codigo <= 20) {
            preco = 20;
        } else if (codigo <= 30) {
            preco = 30;
        } else if (codigo <= 40) {
            preco = 40;
        } else {
            System.out.println("Produto não existe!");
            sc.close();
            return;
        }

        double total = preco * quantidade;

        double desconto;
        if (total <= 250) {
            desconto = total * 0.05;
        } else if (total <= 500) {
            desconto = total * 0.10;
        } else {
            desconto = total * 0.15;
        }

        double finalValor = total - desconto;

        System.out.println("\nPreço unitário: R$ " + preco);
        System.out.println("Total da nota: R$ " + total);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Preço final: R$ " + finalValor);

        sc.close();
    }
}