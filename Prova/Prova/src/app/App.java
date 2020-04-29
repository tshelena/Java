package app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("\n digite o numero correspondente a acao:\n
        1 - adicionar conta corrente \n
        2 - remover conta corrente \n
        3 - depositar \n
        4 - sacar \n
        5 - imprimir contas correntes \n");

        int acao;

        Scanner sc = new Scanner(System.in);
        Banco bank = new Banco;

        if (acao == 1){
            System.out.println("digite nome do cliente:\n");
            String nome_do_cliente = sc.next();
            System.out.println("digite o email do cliente:\n");
            String email = sc.next();
            System.out.println("digite o cpf do cliente:\n");
            String cpf = sc.next();
            System.out.println("digite o numero da agencia: \n");
            String numero_da_agencia = sc.next();
            System.out.println("digite o numero da conta: \n");
            String numero_da_conta = sc.next();
            ContaCorrente = new ContaCorrente(numero_da_agencia, numero_da_conta)
            bank.adicionaConta(conta);
        }
        if (acao == 2){
            System.out.println("digite a conta: \n");
            bank.removeConta(sc.nextIn());
        }

        if (acao == 3){
            System.out.println("informe a conta: \n");
            int conta = sc.nextInt();
            System.out.println("informe o valor a ser depositado: \n");
            bank.deposita(conta, sc.nextDouble());
        }

        if (acao == 4){
            System.out.println("informe a conta: \n");
            int conta = sc.nextInt();
            System.out.println("informe o valor a ser sacado: \n");
            bank.saca(i, sc.nextDouble());
        }

        if (acao == 5){
            System.out.println("contas correntes: \n");
            System.out.println(bank.toString());
        }

        if (acao <=0 || acao >6){
            System.out.println("acao invalida \n");
        }

        }

        }
