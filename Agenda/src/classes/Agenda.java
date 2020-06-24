package classes;
import java.util.ArrayList;

public class Agenda {
    
    ArrayList<Contato> contatos = new ArrayList<Contato>();

    public ArrayList<Contato> getContatos() {
        return this.contatos;
    }

    public static void adicionaContato(Contato contato) {
        if (contato.comunicavel()) {
            this.contatos.add(contato);
        }
    }

    public void removeContatoNome(Contato nome) {
            this.contatos.remove(nome);
        }

        /*public void removeContatoCodg(Contato codigo){
            this.contatos.remove(codigo);
        }

        public void removeContatoTelefone(Contato telefone){
            this.contatos.remove(telefone);
        }
        */
        public void removeTodos() {
            this.contatos.clear();
        } 
        public Integer totalDeContatos(){
            return contatos.size();
        }
    

        @Override
        public String toString(){
            return this.contatos + "\n" ;
        }
    
    }