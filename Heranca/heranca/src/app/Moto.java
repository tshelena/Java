package classes;

public class Moto extends Veiculo {
    private boolean exigeCapacete;
    private String maneabilidade;
    private boolean travada;

    public void trava () {
        this.travada = true;
    }

    public void destrava () {
        this.travada = false;
        System.out.println("moto destravada");
    }
}