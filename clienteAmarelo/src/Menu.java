import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
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

        int operacao = 0;
        if (numero == 123456 && senha.equals("admin")) {
            System.out.println("Acesso concedido. Bem-vindo ao AmareloBank!");

            while (operacao != 8) {
                System.out.println("Funcionalidades disponíveis:");
                System.out.println("1. Cadastrar cliente");
                System.out.println("2. Consultar Dados Pessoais de um Cliente");
                System.out.println("3. Contagem por Sexo");
                System.out.println("4. Listar Clientes por Faixa Etária");
                System.out.println("5. Cliente com Menor/Maior Idade");
                System.out.println("6. Excluir Cliente");
                System.out.println("7. Atualizar Dados do Cliente");
                System.out.println("8. Sair");

                operacao = scanner.nextInt();

                switch (operacao) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        System.out.println("Saindo do AmareloBank. Até a próxima!");

                        return;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }

            }
        } else {
            System.out.println("Número ou senha incorretos. Acesso negado.");
        }

        scanner.close();
    }

}
