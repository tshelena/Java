package classes;

public class Pessoa {

    private String nome;

    public Pessoa (String nome) {
        this.nome = nome;
    }
    
        public void locomover(Veiculo veiculo){

            if(veiculo instanceof Carro)
            {
                System.out.println("estou me locomovendo de carro");

            }else if(veiculo instanceof Moto){
                System.out.println("estou me locomovendo de carro"); 
            }
            else {
             System.out.println("estou me locomovendo");
            }
    }


}