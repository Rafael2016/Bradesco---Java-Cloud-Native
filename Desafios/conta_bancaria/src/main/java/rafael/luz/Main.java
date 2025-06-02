package rafael.luz;

import rafael.luz.model.Cliente;
import rafael.luz.model.ContaCorrente;
import rafael.luz.model.ContaPoupanca;
import rafael.luz.service.Banco;

public class Main {
    public static void main(String[] args) {
        // Criando o banco
        Banco banco = new Banco("Banco Digital");

        // Criando clientes
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00",
                "(11) 99999-9999", "joao@email.com");
        Cliente cliente2 = new Cliente("Maria Santos", "987.654.321-00",
                "(11) 88888-8888", "maria@email.com");

        // Criando contas
        ContaCorrente contaCorrente = new ContaCorrente(cliente1, 1000.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente2);

        // Adicionando contas ao banco
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        System.out.println("\n=== OPERAÇÕES BANCÁRIAS ===\n");

        // Realizando operações
        try {
            // Depósitos
            contaCorrente.depositar(1500.0);
            contaPoupanca.depositar(2000.0);

            System.out.println();

            // Saques
            contaCorrente.sacar(200.0);
            contaPoupanca.sacar(300.0);

            System.out.println();

            // Transferência
            contaCorrente.transferir(500.0, contaPoupanca);

            System.out.println();

            // Aplicando rendimento na poupança
            contaPoupanca.aplicarRendimento();

            System.out.println();

            // Imprimindo extratos
            contaCorrente.imprimirExtrato();
            System.out.println();
            contaPoupanca.imprimirExtrato();

            System.out.println();

            // Listando todas as contas
            banco.listarContas();

        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}