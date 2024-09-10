package sistema.de.gerenciamento.de.atendimento.ao.cliente;

import java.util.Scanner;
import sistema.de.gerenciamento.de.atendimento.ao.cliente.fila.Fila;

public class FormsFilaAtendimento {
    final private Fila filaAtendimento;
    
    public FormsFilaAtendimento(Fila filaAtendimento){
        this.filaAtendimento = filaAtendimento;
    }
    
    public void responder(){
            
       Scanner scanner = new Scanner(System.in);

       System.out.println("Fila de Atendimento");
       filaAtendimento.imprimir();

       System.out.println("Digite os itens da lista (digite '0' para parar):");
       int item;

       while (true) {
           System.out.println("1 - Inserir:");
           System.out.println("2 - Deletar:");
           System.out.println("0 - Imprimir:");

           item = scanner.nextInt();

           switch (item){
               case 1 -> {
                  filaAtendimento.enfileirar();
                  break;
               }
               case 2 -> {
                   filaAtendimento.desenfileirar();
                   break;
               }
               default -> {
                   System.out.println("Fim da operação");
               }
           }

           filaAtendimento.imprimir();

           if (item == 0) {
               break;
           }

       }
    }    
}
