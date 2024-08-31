package sistema.de.gerenciamento.de.atendimento.ao.cliente.pilha;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class NoPilha {
    
    ElementoPilha elementoPilha;
    NoPilha proximo;
    
    public NoPilha()
    {
        this.elementoPilha = null;
        this.proximo = null;
    }

    public ElementoPilha getElemento() {
        return elementoPilha;
    }

    public void setElemento(int id) {
        String descricao;
        String data;
        
        Scanner scanner = new Scanner(System.in);

        elementoPilha.setId(id);
        
        System.out.println("Digite a descrição:");
        descricao = scanner.next(); 
        
        elementoPilha.setDescricao(descricao);
        
        System.out.println("Digite a data:");
        data = scanner.next();
        
        elementoPilha.setData(data);
    }

    public NoPilha getProximo() {
        return proximo;
    }

    public void setProximo(NoPilha proximo) {
        this.proximo = proximo;
    }
}
