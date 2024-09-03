package sistema.de.gerenciamento.de.atendimento.ao.cliente.fila;

public class NoFila {
    ElementoFila elemento;
    NoFila proximo;
    
    public NoFila(ElementoFila elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public ElementoFila getElemento() {
        return elemento;
    }

    public NoFila getProximo() {
        return proximo;
    }

    public void setProximo(NoFila proximo) {
        this.proximo = proximo;
    }
}
