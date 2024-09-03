package sistema.de.gerenciamento.de.atendimento.ao.cliente.fila;

public class Fila {
    private NoFila frente;
    private NoFila tras;
    private int ultimoId;

    public Fila() {
        this.frente = null;
        this.tras = null;
        this.ultimoId = 0;
    }

    public boolean isVazia() {
        return frente == null;
    }

    public void enfileirar(ElementoFila elemento) {
        elemento.setId(++ultimoId);
        NoFila novoNo = new NoFila(elemento);
        if (isVazia()) {
            frente = novoNo;
            tras = novoNo;
        } else {
            tras.setProximo(novoNo);
            tras = novoNo;
        }
    }

    public ElementoFila desenfileirar() throws Exception {
        if (isVazia()) {
            throw new Exception("Fila está vazia.");
        }
        ElementoFila elementoRemovido = frente.getElemento();
        frente = frente.getProximo();
        if (frente == null) {
            tras = null;
        }
        return elementoRemovido;
    }

    public ElementoFila espiar() throws Exception {
        if (isVazia()) {
            throw new Exception("Fila está vazia.");
        }
        return frente.getElemento();
    }

    public void imprimirFila() {
        NoFila atual = frente;
        System.out.println("ID | Nome | Serviço");
        if (frente != null) {
            while (atual != null) {
                ElementoFila elemento = atual.getElemento();
                System.out.println(elemento.getId() + " | " + elemento.getNome() + " | " + elemento.getServico());
                atual = atual.getProximo();
            }
        } else {
            System.out.println("Fila vazia");
        }
    }
}
