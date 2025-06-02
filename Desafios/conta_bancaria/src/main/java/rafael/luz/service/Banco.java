package rafael.luz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import rafael.luz.model.Conta;
import rafael.luz.model.ContaCorrente;
import rafael.luz.model.ContaPoupanca;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        System.out.printf("Conta %s criada com sucesso para %s%n",
                conta.getNumero(), conta.getCliente().getNome());
    }

    public Optional<Conta> buscarConta(String numero) {
        return contas.stream()
                .filter(conta -> conta.getNumero().equals(numero))
                .findFirst();
    }

    public void listarContas() {
        System.out.println("=== CONTAS DO BANCO " + nome.toUpperCase() + " ===");
        contas.forEach(conta -> {
            String tipo = conta instanceof ContaCorrente ? "Corrente" : "Poupança";
            System.out.printf("Conta %s (%s) - %s - Saldo: R$ %.2f%n",
                    conta.getNumero(), tipo,
                    conta.getCliente().getNome(), conta.getSaldo());
        });
        System.out.println("=====================================");
    }

    public void aplicarRendimentoPoupancas() {
        contas.stream()
                .filter(conta -> conta instanceof ContaPoupanca)
                .map(conta -> (ContaPoupanca) conta)
                .forEach(ContaPoupanca::aplicarRendimento);
    }

}
