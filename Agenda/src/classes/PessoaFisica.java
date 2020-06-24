package classes;

public class PessoaFisica extends Contato {

    private final int cpf;

    public PessoaFisica(final String nome, final String email, final int telefone, final int cpf) {
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