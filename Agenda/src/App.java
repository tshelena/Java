import classes.*;

import static java.lang.System.out;

import java.util.Scanner;

public class App extends Agenda {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        Boolean continua = true;

        while (continua) {
            System.out.println("\nSelecione a operação desejada:");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Remover Contato");
            System.out.println("3 - Remover Todos");
            System.out.println("4 - Imprimir Contatos");
            System.out.println("0 - Encerrar");

            switch (sc.nextInt()) {

                // Adicionar Contato
                case 1:
                    sc.nextLine();
                    System.out.println("Digite o nome do contato:");
                    final String nome = sc.nextLine();
                    System.out.println("Digite o email do contato:");
                    final String email = sc.nextLine();
                    /*
                     * System.out.println("Digite o cpf do contato:"); final int cpf = sc.nextInt();
                     */
                    System.out.println("Digite o numero do telefone do contato");
                    final int telefone = sc.nextInt();
                    final Contato contato = new Contato(nome, email, telefone);
                    Agenda.adicionaContato(contato);
                    break;

                // remove contato
                case 2:
                    System.out.println("\nEscolha como voce quer remover o contato:");
                    System.out.println("\n 1 - pelo nome:");
                    System.out.println("\n 2 - pelo codigo:");
                    System.out.println("\n 3 - pelo telefone:");
                    System.out.println("\n 4 - remover todos");
                    /*
                     * switch (sc.nextInt()){ case 1 : sc.nextLine();
                     * System.out.println("Digite o nome do contato:"); String nome = sc.nextLine();
                     * agenda.removeContatoNome(contato); break;
                     * 
                     * case 2: sc.netxLine(); System.out.println("Digite o codigo do contato:");
                     * String codigo = sc.nextLine(); agenda.removeContatoCod(contato); break;
                     * 
                     * case 3: sc.netxLine(); System.out.println("Digite o telefone do contato:");
                     * String telefone = sc.nextLine(); agenda.removeContatoTel(contato); break;
                     * 
                     */
                case 3:
                    System.out.println("\n 4 - remover todos:");

                    agenda.removeTodos();
                    System.out.println("Contatos Removidos");
                    break;

                case 4:
                    System.out.println(contatos.toString());
                
                break;
    
                case 0:
                    sc.close();
                    continua = false;
                break;
    
                default:
                    System.out.println("Digite uma operação válida!");
    
            }
    
        }
        }
        
    }
  

