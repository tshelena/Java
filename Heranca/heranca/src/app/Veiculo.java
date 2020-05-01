package classes;

public class Veiculo {

    private String marca;
    private String nome;
    private double valor;
    private double consumo;
    private boolean ligado;
    
    public void liga () {
        this.ligado = true;
        System.out.println("metodo liga");
    }
    
    public void desliga() {
        this.ligado = false;
    }

}