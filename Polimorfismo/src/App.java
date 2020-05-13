import classes.*; 

public class App {
    public static void main(String[] args) throws Exception {
      
    /*// quando instanciamos
    tipo nome_da_variavel = new tipo();
    //declaração da variavel
      tipo nome_da_variavel;  
    //instancia
      nome_da_variavel = new tipo();
    */
//declaracao variaveis
Animal animal01, animal02, animal03;

animal01 = new Cachorro(3, 30, 4, false);
animal02 = new Gato(2, 10, 4, false);
animal03 = new Pato(1, 12, 4, false);

animal01.som();
animal02.som();
animal03.som();

        System.out.println("Hello, World!");
    }
}
