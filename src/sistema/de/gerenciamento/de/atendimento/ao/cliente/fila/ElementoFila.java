package sistema.de.gerenciamento.de.atendimento.ao.cliente.fila;

/**
 *
 * @author jorge
 */
public class ElementoFila {
    String id;
    String nome;
    String servico;
    
    public void ElementoPilha(String descricao, String data){
        this.nome = descricao;
        this.servico = data;
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(int id){
        if (id < 10){
            this.id= "CLI00" + id;
        }
        else if (id >= 100){
            this.id = "CLI" + id;
        }
        else{
            this.id = "CLI0" + id;
        }
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getServico(){
        return servico;
    }
    
    public void setServico(String servico){
        this.servico = servico;
    }    
}
