import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Integrantes:");
        System.out.println("Nichole Nicolini");
        System.out.println("Dyone Andrade");
        System.out.println("Nicolas");

        System.out.println("Bem-vindo ao AmareloBank, digite o número e senha de acesso para entrar na sua conta:");
        
        System.out.println("Número:");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Senha:");
        String senha = scanner.nextLine();

            if (numero == 123456 && senha.equals("admin")) {
                System.out.println("Acesso concedido. Bem-vindo ao AmareloBank!");
            } else {
                System.out.println("Número ou senha incorretos. Acesso negado.");
            }
    
            scanner.close();
    }

   

}
