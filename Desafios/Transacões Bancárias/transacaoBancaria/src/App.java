import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite Saldo Inicial: ");
        double saldoInicial = scanner.nextDouble();

        double saldoFinal = saldoInicial;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter valor :" + i + ": ");
            double transacao = scanner.nextDouble();
            saldoFinal += transacao;
        }

        System.out.printf("O saldo final da conta bancária após as três transações : %.2f%n", saldoFinal);

        scanner.close();
    }
}
