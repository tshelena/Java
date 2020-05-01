package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("digite o numero correspondente a acao\n"); 
              
        int acao = 0;
        Scanner sc = new Scanner(System.in);
        Banco bank = new Banco("Banco");

        while (acao != 9) {
            System.out.println( "1 - adicionar conta corrente \n" 
            + "2 - remover conta corrente \n" 
            + "3 - depositar \n"
            + "4 - sacar\n"
            + "5 - imprimir contas correntes\n"
            + "6 - finalizar\n");  
        
        switch (sc.nextInt()) {
            case 1:
            System.out.println("\ndigite nome do cliente:\n");
            String nome_do_cliente = sc.next();
            System.out.println("\ndigite o email do cliente:\n");
            String email = sc.next();
            Cliente cliente = new Cliente(nome_do_cliente, email);
            /*System.out.println("digite o cpf do cliente:\n");
            String cpf = sc.next();*/
            System.out.println("\ndigite o numero da agencia: \n");
            String numero_da_agencia = sc.next();
            System.out.println("\ndigite o numero da conta: \n");
            String numero_da_conta = sc.next();
            ContaCorrente conta = new ContaCorrente(numero_da_agencia, numero_da_conta, cliente);
            bank.adicionaConta(conta);
            System.out.println("\nconta adicionada\n");
            break;
            
            case 2:
            System.out.println("\ndigite a conta: \n");
            bank.removeConta(sc.nextInt());
            break;
            
            case 3: 
            System.out.println("\ninforme a conta: \n");
            int numero_conta = sc.nextInt();
            System.out.println("\ninforme o valor a ser depositado:\n");
            bank.deposita(numero_conta, sc.nextDouble());
            break;

            case 4:
            System.out.println("\ninforme a conta: \n");
            int i = sc.nextInt();
            System.out.println("\ninforme o valor a ser sacado: \n");
            bank.saca(i, sc.nextDouble());
            break;

            case 5:
            System.out.println("contas correntes: \n");
            System.out.println(bank.toString());
            
            case 6:
            System.out.println("bye");
            acao = 6;
            sc.close();
            break;
        }
      }

    }
}