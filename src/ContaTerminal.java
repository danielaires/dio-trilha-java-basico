import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) {
       // System.out.println("Hello Word!!");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nomeCliente = entrada.next();
        System.out.println("Digite a agencia:");
        String texto = entrada.next();
        System.out.println("Digite a conta:");
        int numero = entrada.nextInt();
        System.out.println("Digite o saldo:");
        double saldo = entrada.nextDouble();

        System.out.println("Ola "+nomeCliente+" obrigado por criar uma conta em nosso banco, sua agencia e "+texto+ " conta: "+numero+ " e seu saldo: " +saldo+" ja esta disponivel para saque.");

    }
}
