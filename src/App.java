// Importando a classe ContaPoupanca do pacote br.senai.devtubaraosc.model
import br.senai.devtubaraosc.model.ContaPoupanca;

// Classe principal que contém o método main para executar o programa
public class App {
    public static void main(String[] args) {
        // Criando uma instância de ContaPoupanca com taxa de juros de 10%
        ContaPoupanca minhaContaPoupanca = new ContaPoupanca(9876, 5432, "Chad Smith", 1000.0, 10.0);

        // Imprimindo informações da conta
        System.out.println();
        System.out.println("Número da Conta: " + minhaContaPoupanca.getNumeroDaConta());
        System.out.println();
        System.out.println("Agência: " + minhaContaPoupanca.getAgencia());
        System.out.println();
        System.out.println("Nome do Titular: " + minhaContaPoupanca.getNomeDoTitular());
        System.out.println();
        System.out.println("Saldo: R$" + minhaContaPoupanca.getSaldo());

        // Realizando operações de depósito e saque
        System.out.println();
        minhaContaPoupanca.depositar(500.0);
        System.out.println();
        minhaContaPoupanca.sacar(200.0);
        System.out.println();
        minhaContaPoupanca.sacar(2000.0); // Tentativa de sacar mais do que o saldo disponível

        // Adicionando juros
        System.out.println();
        minhaContaPoupanca.adicionarJuros();
    }
}
