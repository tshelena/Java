package classes;

public class Carro extends Veiculo {
    private boolean arCondicionado;
    /*private boolean bancoCouro;
    private int tamanhoPortaMalas;*/

    public Carro (String marca) {
        super(marca);
    }
    
    public void marchaRe () {
        System.out.println("O carro está andando de ré.");
    }

    @Override
    public void som()
    {
        System.out.println("som carro");
    }
    
    @Override
    public String toString() {
        return super.toString() + " Ar condicionado: " + this.arCondicionado;
    }

}