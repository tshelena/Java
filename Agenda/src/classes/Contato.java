package classes;


/*extende pessoa fisica e pessoa juridica*/
public abstract class Contato implements Comunicavel{

    private String nome; 
    private String email;
    /*private int codigo;*/
    private int cpf;
    private int cnpj;
    private int telefone;
    
    
    public Contato (String nome, String email, int cpf, int cnpj, int telefone){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.cnpj = cnpj;
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
    
    /*public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }    
    */
    public int getCpf() {
        return this.cpf;
    }
    
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    public int getCnpj(){
        return this.cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
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