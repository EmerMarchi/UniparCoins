import java.util.ArrayList;
import java.util.List;

public class CarteiraDigital {
    // Propriedade saldo que representa o saldo atual da carteira
    private double saldo;
    // Lista para armazenar o histórico de transações
    private List<String> historicoTransacoes;

    // Construtor para inicializar o saldo e o histórico de transações
    public CarteiraDigital() {
        this.saldo = 0;
        this.historicoTransacoes = new ArrayList<>();
    }

    // Método para adicionar saldo à carteira
    public void adicionarSaldo(double valor) {
        this.saldo += valor;
        historicoTransacoes.add("Adicionado: R$" + valor);
        System.out.printf("Saldo adicionado: R$%.2f. Saldo atual: R$%.2f.%n", valor, saldo);
    }

    // Método para realizar pagamento
    public void realizarPagamento(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            this.saldo -= valor;
            historicoTransacoes.add("Pago: R$" + valor);
            System.out.printf("Pagamento realizado: R$%.2f. Saldo restante: R$%.2f.%n", valor, saldo);
        }
    }

    // Método para verificar o saldo da carteira
    public void verificarSaldo() {
        System.out.printf("Saldo disponível: R$%.2f.%n", saldo);
    }

    // Método para retornar o histórico de transações
    public List<String> getHistoricoTransacoes() {
        return historicoTransacoes;
    }

    // Método main para testar a carteira digital
    public static void main(String[] args) {
        CarteiraDigital minhaCarteira = new CarteiraDigital();
        minhaCarteira.adicionarSaldo(100);
        minhaCarteira.realizarPagamento(30);
        minhaCarteira.verificarSaldo();
        System.out.println("Histórico de Transações: " + minhaCarteira.getHistoricoTransacoes());
    }
}
