import java.util.Scanner;

public class Main {
    private static CarteiraDigital carteiraDigital = new CarteiraDigital();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            menu();
            int opcao = lerEntradaUsuario();
            if (opcao == 4) {
                System.out.println("Saindo do sistema...");
                break;
            }
            executarOpcao(opcao);
        }
    }

    // Função para exibir o menu de opções
    private static void menu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1) Adicionar Saldo");
        System.out.println("2) Realizar Pagamento");
        System.out.println("3) Verificar Saldo");
        System.out.println("4) Sair");
    }

    // Função para ler a entrada do usuário
    private static int lerEntradaUsuario() {
        System.out.print("Opção: ");
        return scanner.nextInt();
    }

    // Função para executar a opção escolhida pelo usuário
    private static void executarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                System.out.print("Digite o valor para adicionar: ");
                double valorAdicionar = scanner.nextDouble();
                carteiraDigital.adicionarSaldo(valorAdicionar);
                break;
            case 2:
                System.out.print("Digite o valor para pagar: ");
                double valorPagar = scanner.nextDouble();
                carteiraDigital.realizarPagamento(valorPagar);
                break;
            case 3:
                carteiraDigital.verificarSaldo();
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
