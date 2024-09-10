package sistema.de.gerenciamento.de.atendimento.ao.cliente;

import java.util.Scanner;
import sistema.de.gerenciamento.de.atendimento.ao.cliente.pilha.Pilha;


public class FormsHistorico {
    final private Pilha historico;
    
    public FormsHistorico(Pilha historico){
        this.historico = historico;
    }
    
    public void responder(){
            
       Scanner scanner = new Scanner(System.in);

       System.out.println("Histórico");
       historico.imprimir();

       System.out.println("Digite os itens da lista (digite '0' para parar):");
       int item;

       while (true) {
           System.out.println("1 - Inserir:");
           System.out.println("2 - Deletar:");
           System.out.println("0 - Imprimir:");

           item = scanner.nextInt();

           switch (item){
               case 1 -> {
                  historico.inserir();
                  break;
               }
               case 2 -> {
                   historico.deletar();
                   break;
               }
               default -> {
                   System.out.println("Fim da operação");
               }
           }

           historico.imprimir();

           if (item == 0) {
               break;
           }

       }
    }
}
