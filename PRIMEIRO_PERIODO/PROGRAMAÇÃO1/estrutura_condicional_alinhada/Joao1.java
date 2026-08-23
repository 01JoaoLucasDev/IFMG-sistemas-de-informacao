package estrutura_condicional_alinhada;
import java.util.Scanner;


public class Joao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o nome de usuario para login: ");
        String usuario = sc.nextLine();

        System.out.println("informe a senha para login: ");
        String senha = sc.nextLine();

        if (usuario.equals("admin") && senha.equals("12345")) {
            System.out.println("Acesso concedido. Bem vindo, admin!");
        } else if (usuario.equals("admin") && !senha.equals("12345")) {
            System.out.println("Senha incorreta!");
        } else {
            System.out.println("Usuário não encontrado!");
        }
 
         sc.close();
    
}
}