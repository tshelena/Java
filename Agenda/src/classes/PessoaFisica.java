package classes;


public class PessoaFisica extends Contato {

    private int cpf;

    public PessoaFisica(String nome, String email, int telefone, int cpf){
        super(nome, email, telefone);
        this.cpf = cpf;
    }
    public int getCpf() {
        return this.cpf;
    }

    @Override
    public boolean comunicavel() {
        // TODO Auto-generated method stub
        return false;
    }
}