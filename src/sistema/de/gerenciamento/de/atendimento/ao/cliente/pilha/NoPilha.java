package sistema.de.gerenciamento.de.atendimento.ao.cliente.pilha;

import java.util.Scanner;


public class NoPilha {
    
    ElementoPilha elementoPilha;
    NoPilha anterior;
    NoPilha proximo;
    
    public NoPilha()
    {
        this.elementoPilha = null;
        this.anterior = null;
        this.proximo = null;
    }

    public ElementoPilha getElemento() {
        return elementoPilha;
    }

    public void setElemento(int id) {         
        Scanner scanner = new Scanner(System.in);
        
        //Usaremos o nextLine para ler o conteúdo com espaço até que haja um \n (Enter)
        
        System.out.println("Digite a descrição:");
        String descricao = scanner.next(); 
        descricao+= scanner.nextLine();

        System.out.println("Digite a data:");
        String data = scanner.next();
        data+= scanner.nextLine();
        
        elementoPilha = new ElementoPilha(descricao, data);
        elementoPilha.setId(id);
        
    }

    public NoPilha getAnterior(){
        return anterior;
    }
    
    public void setAnterior(NoPilha anterior){
        this.anterior = anterior;
    }
    
    public NoPilha getProximo() {
        return proximo;
    }

    public void setProximo(NoPilha proximo) {
        this.proximo = proximo;
    }
}
