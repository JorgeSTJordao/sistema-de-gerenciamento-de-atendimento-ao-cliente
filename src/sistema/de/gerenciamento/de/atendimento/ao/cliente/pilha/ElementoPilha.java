package sistema.de.gerenciamento.de.atendimento.ao.cliente.pilha;


public class ElementoPilha {
    String id;
    String descricao;
    String data;
    
    public ElementoPilha(String descricao, String data){
        this.id = null;
        this.descricao = descricao;
        this.data = data;
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(int id){
        if (id < 10){
            this.id= "REQ00" + id;
        }
        else if (id >= 100){
            this.id = "REQ" + id;
        }
        else{
            this.id = "REQ0" + id;
        }
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getData(){
        return data;
    }
    
    public void setData(String data){
        this.descricao = data;
    }
}
