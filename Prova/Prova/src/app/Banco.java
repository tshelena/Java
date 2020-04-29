package app;
import java.util.ArrayList;

public class Banco {

    private String nome_banco;
    private ArrayList<ContaCorrente> contas;

    public Banco (String nome){
        this.nome_banco = nome;
        this.contas = new ArrayList<ContaCorrente>();
    }

    public String getNome_Banco(){
    return this.nome_banco;
    }


    public ArrayList<ContaCorrente> getContas(){
        return this.contas;
    }

    public void deposita(int numero_conta, Double valor){
        contas.get(numero_conta).deposita(valor);
    }
    
    public void saca(int numero_conta, Double valor){
        contas.get(numero_conta).saca(valor);
    }

    public void adicionaConta(ContaCorrente conta){
        this.contas.add(conta);
    }

    public void removeConta(int numero_conta){
        this.contas.remove(numero_conta);
    }
    
    public Integer total_contas()
    {
        return contas.size();
    }
    public String toString(){
        return "Nome do banco: " + this.nome_banco + "\n" + this.contas;
    }
}
