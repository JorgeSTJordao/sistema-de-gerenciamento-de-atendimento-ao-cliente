package sistema.de.gerenciamento.de.atendimento.ao.cliente.fila;

public class NoFila {
    ElementoFila elementoFila;
    NoFila proximo;

    // construtor do no, recebe um elemento fila
    public NoFila(ElementoFila elementoFila) {
        this.elementoFila = elementoFila;
        this.proximo = null;
    }

    // retorna o elemento do no
    public ElementoFila getElemento() {
        return elementoFila;
    }

    // define o elemento do no
    public void setElemento(ElementoFila elementoFila) {
        this.elementoFila = elementoFila;
    }

    // retorna o proximo no
    public NoFila getProximo() {
        return proximo;
    }

    // define o proximo no
    public void setProximo(NoFila proximo) {
        this.proximo = proximo;
    }
}
