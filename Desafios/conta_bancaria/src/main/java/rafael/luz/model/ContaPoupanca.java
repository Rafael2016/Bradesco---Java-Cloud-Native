package rafael.luz.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)

public class ContaPoupanca extends Conta {

    private double taxaRendimento;
    private static final double TAXA_PADRAO = 0.005; // 0.5% ao mês

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        this.taxaRendimento = TAXA_PADRAO;
    }

    public ContaPoupanca(Cliente cliente, double taxaRendimento) {
        super(cliente);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        double rendimento = saldo * taxaRendimento;
        saldo += rendimento;
        System.out.printf("Rendimento de R$ %.2f aplicado à Conta Poupança%n", rendimento);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== EXTRATO CONTA POUPANÇA ===");
        super.imprimirInfosComuns();
        System.out.printf("Taxa de rendimento: %.3f%%%n", taxaRendimento * 100);
        System.out.println("==============================");
    }

}
