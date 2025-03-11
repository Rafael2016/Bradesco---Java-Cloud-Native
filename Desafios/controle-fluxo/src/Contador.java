import java.util.Scanner;

/**
 * @Classe Custom Exeception
 * @author Rafael Luz
 */
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

/**
 * @Classe Contador
 * @author Rafael Luz
 */

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Digite o primeiro número: ");
            int primeiroNumero = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int segundoNumero = scanner.nextInt();

            contar(primeiroNumero, segundoNumero);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        if (primeiroNumero >= segundoNumero) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contador = segundoNumero - primeiroNumero;
        for (int i = 1; i <= contador; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
