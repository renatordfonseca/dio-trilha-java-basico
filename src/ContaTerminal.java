import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o n�mero da Ag�ncia:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o n�mero da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Exibindo mensagem com os dados inseridos
        System.out.println("Ol� " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua ag�ncia � " + agencia + ", conta " + numero + " e seu saldo " + saldo + " j� est� dispon�vel para saque.");

        // Fechando o scanner
        scanner.close();
		
	}
}
