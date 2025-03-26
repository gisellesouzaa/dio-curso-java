import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        try {
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta!");
        int numero = scanner.nextInt();

        System.out.println("Digite o saldo");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite o seu nome completo!");
        String nomeCliente = scanner.nextLine();
        

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, ");
        System.out.println("sua agência é [" + agencia + "], conta [" + numero + "] e seu saldo [R$ " + String.format("%.2f", saldo) + "] já está disponível para saque.");
        scanner.close();

        } catch (Exception e) {
            System.out.println("Verifique o tipo de dado digitado e tente novamente.");
        }
    }
}
