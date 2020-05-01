package classes;

public class ContaCorrente {
    private String numero_da_agencia;
    private String numero_da_conta;
    private Cliente cliente;
    private Double saldo;
    
    public ContaCorrente (String numero_da_agencia, String numero_da_conta, Cliente cliente){
        this.numero_da_agencia = numero_da_agencia;
        this.numero_da_conta = numero_da_conta;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public String getNumero_da_agencia()
    {
        return this.numero_da_agencia;
    }
    
    public String getNumero_da_conta()
    {
        return this.numero_da_conta;
    }
    
    public Double getSaldo()
    {
        return this.saldo;
    }

    protected Boolean saca(Double valor){
    if (valor > this.saldo){
    return false;
    }
    else
    this.saldo -= valor;
    return true;
}

    protected Boolean deposita(Double valor){
    if (valor >=0){
        this.saldo += valor;
        return true;
    }
    else{
        return false;
    }
    }
    
    public String toString(){
        return this.cliente.toString() +
            "Agencia: " + this.numero_da_agencia  +
            "\nConta: " + this.numero_da_conta  +
            "\nSaldo: " + this.saldo;
    }
 }


