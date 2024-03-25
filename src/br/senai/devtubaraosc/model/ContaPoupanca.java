package br.senai.devtubaraosc.model;

// Classe que representa uma conta poupança, estendendo a classe ContaBancaria
public class ContaPoupanca extends ContaBancaria {
    private double taxaDeJuros;

    // Construtor da classe ContaPoupanca
    public ContaPoupanca(int numeroDaConta, int agencia, String nomeDoTitular, double saldo, double taxaDeJuros) {
        super(numeroDaConta, agencia, nomeDoTitular, saldo); // Chama o construtor da superclasse
        this.taxaDeJuros = taxaDeJuros;
    }

   // Método para adicionar juros à conta poupança
public void adicionarJuros() {
    double juros = getSaldo() * (taxaDeJuros / 100.0); // Calcula os juros corretamente
    depositar(juros); // Adiciona os juros ao saldo
    System.out.printf("Juros de R$%.2f adicionados à conta.%n", juros); // Mensagem de confirmação com o valor correto dos juros
}

}
