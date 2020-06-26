package classes;

public class PessoaFisica extends Contato {

    private int cpf;

    public PessoaFisica(String nome, String email, String telefone, int cpf) {
        super(nome, email, telefone);
        this.cpf = cpf;
    }
    public int getCpf() {
        return this.cpf;
    }

    
}