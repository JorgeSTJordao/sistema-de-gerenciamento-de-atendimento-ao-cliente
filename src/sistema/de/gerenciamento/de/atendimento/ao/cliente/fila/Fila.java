package sistema.de.gerenciamento.de.atendimento.ao.cliente.fila;

import java.util.Scanner;

public class Fila {
    private NoFila frente;
    private NoFila tras;
    private int ultimoId;

    // construtor da fila, define frente e tras como null
    public Fila() {
        this.frente = null;
        this.tras = null;
        this.ultimoId = 0;
    }

    // metodo para enfileirar um cliente na fila
    public void enfileirar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o motivo do atendimento: ");
        String motivo = scanner.nextLine();

        ElementoFila novoElemento = new ElementoFila(nome, motivo);
        novoElemento.setId(ultimoId);
        ultimoId++;
        
        NoFila novoNo = new NoFila(novoElemento);

        // se a fila estiver vazia, frente e tras sao o novo no
        if (tras == null) {
            frente = tras = novoNo;
        } else {
            // adiciona o novo no ao final da fila
            tras.setProximo(novoNo);
            tras = novoNo;
        }
    }

    // metodo para desenfileirar (atender) o proximo cliente
    public void desenfileirar() {
        if (frente == null) {
            System.out.println("Fila vazia.");
        } else {
            // mostra o cliente da frente e remove da fila
            frente.getElemento().mostrarElemento();
            frente = frente.getProximo();

            // se a fila ficar vazia, tras tambem e null
            if (frente == null) {
                tras = null;
            }
        }
    }

    // metodo para imprimir todos os clientes na fila
    public void imprimir() {
        NoFila atual = frente;

        if (frente != null) {
            System.out.println("Fila de Atendimento:");
            while (atual != null) {
                // mostra cada cliente na fila
                atual.getElemento().mostrarElemento();
                atual = atual.getProximo();
            }
        } else {
            System.out.println("A fila de atendimento vazia.");
        }
    }
}
