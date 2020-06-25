package classes;
import java.util.ArrayList;

public class Agenda {
    
    protected static ArrayList<Contato> contatos = new ArrayList<Contato>();
	public char[] lista;

   

    public void adicionaContato(Contato contato) {
            if(contato.comunicavel()){
                contatos.add(contato);
            }else{
                System.out.println("Não é comunicável");
            }
     
    }

    public ArrayList<Contato> getContatos() {
        return this.contatos;
    }
    public void removeContato(String nome) {
            contatos.remove(nome);
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

        public String pesquisaPorNome(String nome){
            String lista="";
            for(int i=0;i<this.contatos.size();i++){
                Contato contato=this.contatos.get(i);
                if(contato.getNome().equals(nome)){
                    lista+=contato.getNome();
                }
            }
            return lista;
        }

        public Integer totalDeContatos(){
            return contatos.size();
        }
    

        @Override
        public String toString(){
            return this.contatos + "\n" ;
        }
    
    }