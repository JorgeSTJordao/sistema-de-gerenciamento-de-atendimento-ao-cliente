package sistema.de.gerenciamento.de.atendimento.ao.cliente;

import sistema.de.gerenciamento.de.atendimento.ao.cliente.pilha.Pilha;

public class SistemaDeGerenciamentoDeAtendimentoAoCliente {

   
    public static void main(String[] args) {
        Pilha historico = new Pilha();
             
        historico.inserir();
        historico.inserir();
        historico.imprimir();
        historico.deletar();
        historico.imprimir();
    }   
}
