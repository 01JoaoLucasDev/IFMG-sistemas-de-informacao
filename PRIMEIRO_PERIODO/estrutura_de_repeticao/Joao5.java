package estrutura_de_repeticao;

public class Joao5 {
    public static void main(String[] args) {
        int soma = 0;
        int qtd = 10;

        for (int i = 1; i <= qtd; i++) {
            soma += i; 
        }

        double media = (double) soma / qtd;

        System.out.println("A soma dos 10 primeiros números é: " + soma);
        System.out.println("A média dos 10 primeiros números é: " + media);
    }
}