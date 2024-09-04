package sistema.de.gerenciamento.de.atendimento.ao.cliente.pilha;

import java.util.Scanner;


public class NoPilha {
    
    ElementoPilha elementoPilha;
    NoPilha anterior;
    NoPilha proximo;
    
    //Construtor da pilha
    //Anterior: nó (histórico) anterior
    //Proximo: nó (histórico) posterior
    public NoPilha()
    {
        this.elementoPilha = null;
        this.anterior = null;
        this.proximo = null;
    }

    //Retorna o elemento da pilha (histórico)
    public ElementoPilha getElemento() {
        return elementoPilha;
    }

    //Insere os dados em um histórico novo
    //O id deve ser único e enviado a partir do Histórico
    public void setElemento(int id, String data) {         
        Scanner scanner = new Scanner(System.in);
        
        //Usaremos o nextLine para ler o conteúdo com espaço até que haja um \n (Enter)
            
        //Descrição
        System.out.println("Digite a descrição:");
        String descricao = scanner.next(); 
        descricao+= scanner.nextLine();
        
        //Cria a estrutura e insere o ID posteriormente (único não acessado pelo usuário)
        elementoPilha = new ElementoPilha(descricao, data);
        elementoPilha.setId(id);
        
    }

    //Retorna o histórico anterior
    public NoPilha getAnterior(){
        return anterior;
    }
    
    //Altera o histórico anterior quando deletado
    public void setAnterior(NoPilha anterior){
        this.anterior = anterior;
    }
    
    //Resgata o próximo histórico
    public NoPilha getProximo() {
        return proximo;
    }

    //Insere um novo histórico
    public void setProximo(NoPilha proximo) {
        this.proximo = proximo;
    }
}
