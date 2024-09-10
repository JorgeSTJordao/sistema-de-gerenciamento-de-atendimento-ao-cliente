package sistema.de.gerenciamento.de.atendimento.ao.cliente.pilha;


public class Pilha {
    private NoPilha Historico;
    private NoPilha topo;
    private int ultimoId;
    final private int[] ultimaData; //Valor atribuído uma única vez
    final private String[] ultimaDataString; //Valor atribuído uma única vez
    
    public Pilha(){
        this.ultimoId = 0;
        this.ultimaData = new int[]{30, 10, 3, 9, 2024}; //minutos - hora - dia - mês - ano
        this.ultimaDataString = new String[]{"30", "10", "03", "09", "2024"};
        this.topo = null;
        this.Historico = null;
    }
    
    
     //Inserindo os nós
    public void inserir (){
        //Data em String
        String data = ultimaDataString[4] + "-" + 
                ultimaDataString[3] + "-" +
                ultimaDataString[2] + " " +
                ultimaDataString[1] + ":" +
                ultimaDataString[0];
        
        NoPilha no = new NoPilha();
        
        no.setElemento(ultimoId, data);
        
        //Ajustar os valores para a próxima estrutura
        ultimoId++;
             
        //Ajustar data
        //Minutos
        if (ultimaData[0] == 30){
            ultimaData[0] = 0;
            ultimaDataString[0] = "00";
            
            //Horas
            if (ultimaData[1] == 23){
                ultimaData[1] = 0;
                ultimaDataString[1] = "00";

                //Dias
                if (ultimaData[2] == 30){
                    ultimaData[2] = 1;
                    ultimaDataString[1] = "01";

                    //Mês
                    if (ultimaData[3] == 12) {
                        ultimaData[3] = 1;
                        ultimaDataString[1] = "01";

                        //Ano
                        ultimaData[4] += 1;
                        
                    } else {
                        ultimaData[3] += 1;
                        verificarZero(ultimaData[3], 3);

                    }
                } else {
                    ultimaData[2] += 1;
                    verificarZero(ultimaData[2], 2);

                }
                
            } else {
                ultimaData[1] += 1;
                verificarZero(ultimaData[1], 1);
            }
            
        } else {
            //Incrementa 30 minutos
            ultimaData[0] += 30;
            ultimaDataString[0] = "30";
        }
              
        
        
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
    
    public void verificarZero(int valor, int index){
        if (valor > 9)
            ultimaDataString[index] = "" + ultimaData[index];
        else
            ultimaDataString[index] = "0" + ultimaData[index];
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