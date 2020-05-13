package classes;

public class Cliente {
    private String nome_do_cliente;
    private String cpf;
    private String email;
    
    public Cliente(String nome_do_cliente, String email) {
        this.nome_do_cliente = nome_do_cliente;
        this.email = email;
        
    }
       
       public String getNome_do_cliente() {
        return this.nome_do_cliente;
    }
   
    public String getcpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getemail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String toString(){
    return "\nnome cliente: " + this.nome_do_cliente + "\n" +
            "email: " + this.email + "\n" + 
            "CPF: " + this.cpf + "\n";         
        }
    }
