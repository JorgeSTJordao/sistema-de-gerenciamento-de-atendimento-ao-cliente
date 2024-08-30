/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.gerenciamento.de.atendimento.ao.cliente.pilha;

/**
 *
 * @author jorge
 */
public class ElementoPilha {
    String id;
    String descricao;
    String data;
    
    public void ElementoPilha(String descricao, String data){
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
