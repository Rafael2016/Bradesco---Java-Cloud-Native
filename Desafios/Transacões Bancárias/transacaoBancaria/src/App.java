import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo");

        double saldo = scanner.nextDouble();

        for (int i = 1; i <= 3; i++) {

            System.out.print("Digite o valor da transação " + i);

            saldo += scanner.nextDouble();
        }

        // Saldo final
        System.out.printf("Saldo final da conta: %.2f\n", saldo);

        scanner.close();
    }
}
