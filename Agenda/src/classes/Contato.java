package classes;

public class Contato implements Comunicavel{

    private String nome; 
    private String email;
    /*private int codigo;*/
    private int telefone;
    
    
    public Contato (final String nome, final String email, final int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    /*
     * public int getCodigo() { return codigo; }
     * 
     * public void setCodigo(int codigo) { this.codigo = codigo; }
     */

    public int getTelefone() {
        return this.telefone;
    }

    public void setTelefone(final int telefone) {
       this.telefone = telefone;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + "\n" +
        " E-mail: " + this.email + "\n" + 
        " Telefone: " + this.telefone + "\n" ;
    }

    @Override
    public boolean comunicavel() {
        // TODO Auto-generated method stub
        return false;
    }
}