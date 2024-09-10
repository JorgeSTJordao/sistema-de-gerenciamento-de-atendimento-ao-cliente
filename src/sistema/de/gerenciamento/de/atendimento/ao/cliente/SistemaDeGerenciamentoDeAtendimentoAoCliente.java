package sistema.de.gerenciamento.de.atendimento.ao.cliente;

import java.util.Scanner;
import sistema.de.gerenciamento.de.atendimento.ao.cliente.fila.Fila;
import sistema.de.gerenciamento.de.atendimento.ao.cliente.pilha.Pilha;

public class SistemaDeGerenciamentoDeAtendimentoAoCliente {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha historico = new Pilha();
        Fila filaAtendimento = new Fila();
        
        FormsHistorico formsHistorico = new FormsHistorico(historico);
        FormsFilaAtendimento formsFilaAtendimento = new FormsFilaAtendimento(filaAtendimento);

            //Formulário
        while(true){
            System.out.println("[1] - Histórico");
            System.out.println("[2] - Fila de atendimento");

            System.out.println("Escolha uma opção:");
            int opcao = scanner.nextInt(); 

            switch (opcao) {
                case 1 -> formsHistorico.responder();
                case 2 -> formsFilaAtendimento.responder();
                default -> System.out.println("Selecione uma opção corretamente");
            }
        }
    }   
}
