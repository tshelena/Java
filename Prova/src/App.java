import classes.*;
import java.util.Scanner;

public class App {
    public static void main(final String[] args) throws Exception {
        
        System.out.println("digite o numero correspondente a acao\n"); 
        int acao=9;
        final Scanner sc = new Scanner(System.in);
        final Banco bank = new Banco("Banco");
    
        while (acao != 0) {
            System.out.println( "\n1 - adicionar conta corrente \n" 
            + "2 - remover conta corrente \n" 
            + "3 - depositar \n"
            + "4 - sacar\n"
            + "5 - imprimir contas correntes\n"
            + "6 - finalizar\n");  
        
        switch (sc.nextInt()) {
            case 1:
            System.out.println("\ndigite nome do cliente:");
            final String nome_do_cliente = sc.next();
            System.out.println("\ndigite o email do cliente:");
            final String email = sc.next();
            final Cliente cliente = new Cliente(nome_do_cliente, email);
            System.out.println("\ndigite o cpf do cliente:");
            String cpf = sc.next();
            System.out.println("\ndigite o numero da agencia:");
            final String numero_da_agencia = sc.next();
            System.out.println("\ndigite o numero da conta:");
            final String numero_da_conta = sc.next();
            final ContaCorrente conta = new ContaCorrente(numero_da_agencia, numero_da_conta, cliente);
            bank.adicionaConta(conta);
            System.out.println("\n --- conta adicionada ---\n");
            break;
            
            case 2:
            System.out.println("\ndigite a conta:");
            bank.removeConta(sc.nextInt());
            System.out.println("\n --- removida ---\n");
            break;
            
            case 3: 
            System.out.println("\ninforme a conta:");
            final int numero_conta = sc.nextInt();
            System.out.println("\ninforme o valor a ser depositado:");
            bank.deposita(numero_conta, sc.nextDouble());
            System.out.println("\n --- deposito ok ---\n");
            break;

            case 4:
            System.out.println("\ninforme a conta: \n");
            final int i = sc.nextInt();
            System.out.println("\ninforme o valor a ser sacado:");
            bank.saca(i, sc.nextDouble());
            break;

            case 5:
            System.out.println("\ncontas correntes:");
            System.out.println(bank.toString());
            
            case 6:
            System.out.println("bye");
            acao = 0;
            sc.close();
            break;
        }
      }

    }
}