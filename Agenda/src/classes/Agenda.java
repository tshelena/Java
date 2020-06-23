package classes;
import java.util.ArrayList;

public class Agenda {
    
    
    private ArrayList<Contato> contatos = new ArrayList<Contato>();
    
    
        public ArrayList<Contato> getContatos() {
            return this.contatos;
        }
    
        public void adicionaContato(Contato contato){
            this.contatos.add(contato);
        }
    
        public void removeContatoNome(Contato nome){
            this.contatos.remove(nome);
        }

        public void removeContatoCodg(Contato codigo){
            this.contatos.remove(codigo);
        }

        public void removeContatoTelefone(Contato telefone){
            this.contatos.remove(telefone);
        }

        public void removeTodos() {
            this.contatos.clear();
        } 
        public Integer totalDeContatos(){
            return contatos.size();
        }
    

        @Override
        public final boolean comunicavel(){
        if (this.contatos.isEmpty()){
            return false;
        }
        return true;
    }




        @Override
        public String toString(){
            return this.contatos + "\n" ;
        }
    
    }