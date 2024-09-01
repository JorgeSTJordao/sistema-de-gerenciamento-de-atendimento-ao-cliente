package sistema.de.gerenciamento.de.atendimento.ao.cliente.pilha;

/**
 *
 * @author jorge
 */
public class Pilha {
    private NoPilha Historico;
    private NoPilha topo;
    private int ultimoId;
    
    public Pilha(){
        this.ultimoId = 0;
        this.topo = null;
        this.Historico = null;
    }
    
    
     //Inserindo os nós
    public void inserir (){
        NoPilha no = new NoPilha();
        
        no.setElemento(ultimoId);
        ultimoId++;
        
        if(Historico == null){
            Historico =no;
            topo = no;
        } else {  
            NoPilha atual = Historico;

            while(atual.getProximo()!=null){
                atual = atual.getProximo();
            }

            atual.setProximo(no);
            no.setAnterior(atual);           
            topo = no;
        }
    }
    
    //Imprimindo o histórico 
    public void imprime(){
        NoPilha atual = Historico;
        
        System.out.print("ID | Descrição | Data");

        while (atual != null) {
            ElementoPilha elemento = atual.getElemento();

            System.out.print(elemento.id + " | " + elemento.descricao + " | " + elemento.data);
            atual= atual.getProximo();
        }
        
        System.out.println("Acabou");
  
    }
}
