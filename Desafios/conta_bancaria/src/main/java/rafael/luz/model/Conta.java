package rafael.luz.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public abstract class Conta {

    @EqualsAndHashCode.Include
    protected String numero;
    protected String agencia;
    protected double saldo;
    protected Cliente cliente;

    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente) {
        this.agencia = "0001";
        this.numero = String.format("%04d", SEQUENCIAL++);
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo -= valor;
        System.out.printf("Saque de R$ %.2f realizado com sucesso%n", valor);
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado com sucesso%n", valor);
    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para transferência");
        }

        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.printf("Transferência de R$ %.2f realizada para conta %s%n",
                valor, contaDestino.getNumero());
    }

    public abstract void imprimirExtrato();

    protected void imprimirInfosComuns() {
        System.out.println("=== EXTRATO BANCÁRIO ===");
        System.out.printf("Titular: %s%n", cliente.getNome());
        System.out.printf("Agência: %s%n", agencia);
        System.out.printf("Número: %s%n", numero);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
        System.out.println("========================");
    }

}
