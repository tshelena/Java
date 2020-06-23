package classes;

import java.util.ArrayList;

/*extende pessoa fisica e pessoa juridica*/
    public class Contato {

    private String nome; 
    private String email;
    private int codigo;
    private int cpf;
    private int telefone;
    
    public Contato(String nome){
        this.nome = nome;
    }
    
    public Contato (String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    
    public Contato (String nome, String email, int cpf, int telefone){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
        
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }    
    public int getCpf() {
        return this.cpf;
    }
    
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    public int getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(int telefone) {
       this.telefone = telefone;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + "\n" +
        " E-mail: " + this.email + "\n" + 
        " CPF: " + this.cpf + "\n" +
        " Telefone: " + this.telefone + "\n" ;
    }
}