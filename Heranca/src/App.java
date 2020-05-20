
import classes.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Carro onix = new Carro("chevrolet");
        /*Carro camaro = new Carro("chevrolet");
        Carro uno = new Carro("chevrolet");*/
        Moto moto = new Moto("chevrolet");
        Pessoa marcos = new Pessoa("Marcos");

        /*moto.ligar();
        onix.ligar();
        camaro.ligar();
        uno.ligar();*/

        onix.som();
        moto.som();


        marcos.locomover(moto);

        System.out.println(moto);
        System.out.println(onix);
    }
}