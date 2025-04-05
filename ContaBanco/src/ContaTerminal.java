import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        String agencia;
        String numero;
        String nomeCliente;
        double saldo;
        
        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta: ");
        numero = scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo: ");
        saldo = scanner.nextDouble();
        
        scanner.close();
        
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
                          agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque";
        
        System.out.println(mensagem);
    }
}