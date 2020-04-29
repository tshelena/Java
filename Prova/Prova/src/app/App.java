package app;

import java.util.Scanner;


public class App {

    public static void main(String[] args) throws Exception {
        
        int acao = 0;
         /*System.out.println ("digite o numero correspondente a acao:\n
        1  adicionar conta corrente \n
        2  remover conta corrente \n
        3  depositar \n
        4  sacar \n
        5  imprimir contas correntes \n");*/

        Scanner sc = new Scanner(System.in);
        Banco bank = new Banco("Banco");


        acao = sc.nextInt();

        if (acao == 1){
           /*System.out.println("digite nome do cliente:\n");
            String nome_do_cliente = sc.next();
            System.out.println("digite o email do cliente:\n");
            String email = sc.next();
            System.out.println("digite o cpf do cliente:\n");
            String cpf = sc.next();
            System.out.println("digite o numero da agencia: \n");
            String numero_da_agencia = sc.next();
            System.out.println("digite o numero da conta: \n");
            String numero_da_conta = sc.next();
            ContaCorrente conta = new ContaCorrente(numero_da_agencia, numero_da_conta, cliente);
            bank.adicionaConta(conta);*/
        }
            else {
            if (acao == 2){
            System.out.println("digite a conta: \n");
            bank.removeConta(sc.nextInt());
            }
            else{
            if (acao == 3){
            System.out.println("informe a conta: \n");
            int conta = sc.nextInt();
            System.out.println("informe o valor a ser depositado: \n");
            bank.deposita(conta, sc.nextDouble());
        }
            else {
        if (acao == 4){
            System.out.println("informe a conta: \n");
            int i = sc.nextInt();
            System.out.println("informe o valor a ser sacado: \n");
            bank.saca(i, sc.nextDouble());
        }
            else {
        if (acao == 5){
            System.out.println("contas correntes: \n");
            System.out.println(bank.toString());
        }
        else{
        if (acao <=0 || acao >6){
            System.out.println("acao invalida \n");
        }
    }
}
   
            }
        }
        }
        sc.close();
        }
        
        }
