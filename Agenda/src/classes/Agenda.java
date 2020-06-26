package classes;
import java.util.ArrayList;

public class Agenda {
    
    protected static ArrayList<Contato> contatos = new ArrayList<>();
    
    
    public void adicionaContato(Contato contato) {
            if(contato.comunicavel()){
                contatos.add(contato);
            }
            else{
            System.out.println("Contato precisa ser comunicável");
            }
     
    }

        public void removeContato(String nome, Object contato) {
            contatos.remove(contato);


            }
        
    public void removeTodos() {
            contatos.clear();
        } 
    
    public Integer totalDeContatos(){
            return contatos.size();
        }
    

        @Override
        public String toString(){
            return contatos.toString() + "\n";
        }
    
    }