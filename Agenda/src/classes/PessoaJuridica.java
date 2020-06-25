package classes;


public class PessoaJuridica extends Contato {

    private int cnpj;

    public PessoaJuridica(String nome, String email, int telefone, int cnpj) {
        super(nome, email, telefone);
        this.cnpj = cnpj;
    }
    public int getCnpj() {
        return this.cnpj;
    }

}