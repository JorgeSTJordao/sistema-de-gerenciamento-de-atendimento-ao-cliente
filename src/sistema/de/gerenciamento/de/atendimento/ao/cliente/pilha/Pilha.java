package sistema.de.gerenciamento.de.atendimento.ao.cliente.pilha;


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
    
    //Deletando dados do histórico (top - down)
    public void deletar (){

        //Condição de parada: o último elemento sempre tem o próximo nó nulo
        if (Historico == null){
            System.out.println("Histórico vazio");
        }
        else {
            if (topo.anterior == null){
                Historico = null;
                topo = null;
            } else {
                NoPilha anterior = topo.anterior;
                anterior.setProximo(null);
                topo = anterior;
            }
        }       
    }
    
    //Imprimindo o histórico 
    public void imprimir(){
        NoPilha atual = Historico;
        
        System.out.println("ID | Descrição | Data");

        if (Historico != null){
            while (atual != null) {
                ElementoPilha elemento = atual.getElemento();

                System.out.println(elemento.id + " | " + elemento.descricao + " | " + elemento.data);
                atual= atual.getProximo();
            }
        }
        else {
           System.out.println("Histórico vazio");
        }
    }
   
}
