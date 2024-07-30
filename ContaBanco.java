
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o número da conta
        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = scanner.nextInt();

        // Limpa o buffer do scanner
        scanner.nextLine();

        // Solicita e lê a agência
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        // Solicita e lê o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scanner.nextLine();

        // Solicita e lê o saldo
        System.out.println("Por favor, digite o saldo!");
        double saldo = scanner.nextDouble();

        // Exibe a mensagem formatada com os dados inseridos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo
                + " já está disponível para saque.");

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
