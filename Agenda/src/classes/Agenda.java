package classes;
import java.util.ArrayList;

public class Agenda {
    
    
    static ArrayList<Contato> contatos = new ArrayList<Contato>();

    public ArrayList<Contato> getContatos() {
        return Agenda.contatos;
    }

    public static void adicionaContato(Contato contato) {
        if (contato.comunicavel()) {
            contatos.add(contato);
            }
        }
    
        public void removeContatoNome(Contato nome){
            Agenda.contatos.remove(nome);
        }

        /*public void removeContatoCodg(Contato codigo){
            this.contatos.remove(codigo);
        }

        public void removeContatoTelefone(Contato telefone){
            this.contatos.remove(telefone);
        }
        */
        public void removeTodos() {
            Agenda.contatos.clear();
        } 
        public Integer totalDeContatos(){
            return contatos.size();
        }
    

        @Override
        public String toString(){
            return Agenda.contatos + "\n";
        }
    
    }