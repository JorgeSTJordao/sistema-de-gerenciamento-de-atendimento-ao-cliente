package sistema.de.gerenciamento.de.atendimento.ao.cliente.fila;

public class ElementoFila {
    String id;
    String nome;
    String motivo;

    // construtor do elemento da fila
    public ElementoFila(String nome, String motivo) {
        this.nome = nome;
        this.motivo = motivo;
    }
    
    // retorna o id do cliente
    public String getId() {
        return id;
    }

    // define o id do cliente
    public void setId(int id) {
        
        if (id < 10){
            this.id= "REQ00" + id;
        }
        else if (id >= 100){
            this.id = "REQ" + id;
        }
        else{
            this.id = "REQ0" + id;
        }
    }
    
    
    // retorna o nome do cliente
    public String getNome() {
        return nome;
    }

    // define o nome do cliente
    public void setNome(String nome) {
        this.nome = nome;
    }


    // retorna o motivo do atendimento
    public String getMotivo() {
        return motivo;
    }

    // define o motivo do atendimento
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    // exibe as informacoes do cliente
    public void mostrarElemento() {
        System.out.println("ID: " + id +  "| Nome: " + nome + " | Motivo: " + motivo);
    }
}
