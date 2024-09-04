package sistema.de.gerenciamento.de.atendimento.ao.cliente;

import java.util.Scanner;
import sistema.de.gerenciamento.de.atendimento.ao.cliente.pilha.Pilha;

public class SistemaDeGerenciamentoDeAtendimentoAoCliente {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha historico = new Pilha();
        
        FormsHistorico formsHistorico = new FormsHistorico(historico);

            //Formulário
        while(true){
            System.out.println("[1] - Histórico");
            System.out.println("[2] - Fila de atendimento");

            System.out.println("Escolha uma opção:");
            int opcao = scanner.nextInt(); 

            if (opcao == 1){
                formsHistorico.responder();
            }
        }
    }   
}
