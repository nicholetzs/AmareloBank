import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArvoreBinariaPesquisa arvore = new ArvoreBinariaPesquisa();        System.out.println("Integrantes:");
        System.out.println("Nichole Nicolini");
        System.out.println("Dyone Andrade");
        System.out.println("Nicolas");
        System.out.println();
        System.out.println("Bem-vindo ao AmareloBank, digite o número e senha de acesso para entrar na sua conta:");
        System.out.print("Número: ");
        String numero = scanner.nextLine().trim();
        System.out.print("Senha: ");
        String senha = scanner.nextLine().trim();
        if (numero.equals("123456") && senha.equals("admin")) {
            System.out.println("\nAcesso concedido. Bem-vindo ao AmareloBank!");
            int operacao = 0;
            while (operacao != 8) {
                System.out.println("\nFuncionalidades disponíveis:");
                System.out.println("1. Cadastrar cliente");
                System.out.println("2. Consultar Dados Pessoais de um Cliente");
                System.out.println("3. Contagem por Sexo");
                System.out.println("4. Listar Clientes por Faixa Etária");
                System.out.println("5. Cliente com Menor/Maior Idade");
                System.out.println("6. Excluir Cliente");
                System.out.println("7. Atualizar Dados do Cliente");
                System.out.println("8. Sair");
                operacao = lerInteiro(scanner, "Escolha uma opção: ", "Erro: Opção inválida. Digite um número de 1 a 8.", 1, 8);
                switch (operacao) {
                    case 1:
                        String nome = lerString(scanner, "Nome: ", "Erro: O nome não pode ser vazio.");
                        String cpf = lerCpf(scanner, "CPF (11 dígitos): ");
                        int idade = lerInteiro(scanner, "Idade: ", "Erro: Idade deve ser maior que 0.", 1, 150);
                        String sexo = lerSexo(scanner, "Sexo (M/F): ");
                        double saldo = lerDouble(scanner, "Saldo inicial: R$ ", "Erro: Saldo deve ser um valor positivo.", 0.0);
                        if (arvore.pesquisar(nome)) {
                            System.out.println("Erro: Nome já existe!");
                        } else if (arvore.pesquisarCpf(cpf)) {
                            System.out.println("Erro: CPF já existe!");
                        } else {
                            Cliente novo = new Cliente(nome, cpf, idade, sexo, saldo);
                            if (arvore.inserir(novo)) {
                                System.out.println("Cliente cadastrado com sucesso!");
                            } else {
                                System.out.println("Erro ao cadastrar cliente.");
                            }
                        }
                        break;
                    case 2:
                        String nomeBusca = lerString(scanner, "Digite o nome do cliente para consulta: ", "Erro: O nome não pode ser vazio.");
                        Cliente cliente = arvore.consultar(nomeBusca);
                        if (cliente != null) {
                            System.out.println("\n--- Dados do Cliente ---");
                            System.out.println("Nome: " + cliente.getNome());
                            System.out.println("CPF: " + cliente.getCpf());
                            System.out.println("Idade: " + cliente.getIdade());
                            System.out.println("Sexo: " + cliente.getSexo());
                            System.out.println("Saldo: R$ " + String.format("%.2f", cliente.getSaldoCliente()));
                        } else {
                            System.out.println("Erro: Cliente não encontrado.");
                        }
                        break;
                    case 3:
                        int masc = arvore.contarPorSexo("M");
                        int fem = arvore.contarPorSexo("F");
                        System.out.println("\n--- Contagem por Sexo ---");
                        System.out.println("Masculino (M): " + masc);
                        System.out.println("Feminino (F): " + fem);
                        System.out.println("Total de clientes: " + (masc + fem));
                        break;
                    case 4:
                        int minIdade = lerInteiro(scanner, "Idade mínima: ", "Erro: Idade inválida.", 0, 150);
                        int maxIdade = lerInteiro(scanner, "Idade máxima: ", "Erro: Idade inválida (deve ser maior ou igual à mínima).", minIdade, 150);
                        System.out.println("\n--- Clientes na faixa etária entre " + minIdade + " e " + maxIdade + " anos ---");
                        arvore.listarPorFaixaEtaria(minIdade, maxIdade);
                        break;
                    case 5:
                        Cliente menor = arvore.obterClienteMenorIdade();
                        Cliente maior = arvore.obterClienteMaiorIdade();
                        if (menor != null && maior != null) {
                            System.out.println("\n--- Cliente mais Jovem ---");
                            System.out.println(menor);
                            System.out.println("\n--- Cliente mais Velho ---");
                            System.out.println(maior);
                        } else {
                            System.out.println("Erro: Nenhum cliente cadastrado.");
                        }
                        break;
                    case 6:
                        String nomeExcluir = lerString(scanner, "Digite o nome do cliente a ser excluído: ", "Erro: O nome não pode ser vazio.");
                        if (arvore.remover(nomeExcluir)) {
                            System.out.println("Cliente excluído com sucesso!");
                        } else {
                            System.out.println("Erro: Cliente não encontrado.");
                        }
                        break;
                    case 7:
                        String nomeAtualizar = lerString(scanner, "Digite o nome do cliente para atualizar dados: ", "Erro: O nome não pode ser vazio.");
                        Cliente clienteAt = arvore.consultar(nomeAtualizar);
                        if (clienteAt != null) {
                            System.out.println("Cliente encontrado. Insira os novos dados (Nome e CPF são inalteráveis):");
                            int novaIdade = lerInteiro(scanner, "Nova idade: ", "Erro: Idade inválida.", 1, 150);
                            String novoSexo = lerSexo(scanner, "Novo sexo (M/F): ");
                            double novoSaldo = lerDouble(scanner, "Novo saldo: R$ ", "Erro: Saldo deve ser positivo.", 0.0);
                            clienteAt.setIdade(novaIdade);
                            clienteAt.setSexo(novoSexo);
                            clienteAt.setSaldoCliente(novoSaldo);
                            System.out.println("Dados do cliente atualizados com sucesso!");
                        } else {
                            System.out.println("Erro: Cliente não encontrado.");
                        }
                        break;
                    case 8:
                        System.out.println("Saindo do AmareloBank. Até a próxima!");
                        break;
                }
            }
        } else {
            System.out.println("Número ou senha incorretos. Acesso negado.");
        }
        scanner.close();
    }
    private static int lerInteiro(Scanner scanner, String prompt, String erro, int min, int max) {
        while (true) {
            System.out.print(prompt);
            String entrada = scanner.nextLine().trim();
            try {
                int valor = Integer.parseInt(entrada);
                if (valor >= min && valor <= max) {
                    return valor;
                }
            } catch (NumberFormatException e) {
            }
            System.out.println(erro);
        }
    }
    private static double lerDouble(Scanner scanner, String prompt, String erro, double min) {
        while (true) {
            System.out.print(prompt);
            String entrada = scanner.nextLine().trim();
            try {
                double valor = Double.parseDouble(entrada);
                if (valor >= min) {
                    return valor;
                }
            } catch (NumberFormatException e) {
            }
            System.out.println(erro);
        }
    }
    private static String lerString(Scanner scanner, String prompt, String erro) {
        while (true) {
            System.out.print(prompt);
            String entrada = scanner.nextLine().trim();
            if (!entrada.isEmpty()) {
                return entrada;
            }
            System.out.println(erro);
        }
    }
    private static String lerCpf(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String entrada = scanner.nextLine().trim();
            String limpo = entrada.replaceAll("\\D", "");
            if (limpo.length() == 11) {
                return limpo.substring(0, 3) + "." +
                       limpo.substring(3, 6) + "." +
                       limpo.substring(6, 9) + "-" +
                       limpo.substring(9);
            }
            System.out.println("Erro: CPF inválido. Deve conter exatamente 11 dígitos numéricos.");
        }
    }
    private static String lerSexo(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String entrada = scanner.nextLine().trim().toUpperCase();
            if (entrada.equals("M") || entrada.equals("F")) {
                return entrada;
            }
            System.out.println("Erro: Sexo inválido. Digite M para Masculino ou F para Feminino.");
        }
    }
}
