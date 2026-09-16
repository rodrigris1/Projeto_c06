public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores;
    private int quantidadeComputadores;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[20];
        this.quantidadeComputadores = 0;
    }

    public void comprarComputador(Computador pc) {
        if (this.quantidadeComputadores < this.computadores.length) {
            this.computadores[this.quantidadeComputadores] = pc;
            this.quantidadeComputadores++;
        }
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < this.quantidadeComputadores; i++) {
            total += this.computadores[i].retornaPreco();
        }
        return total;
    }

    public void mostrarCarrinho() {
        System.out.println("\n=== DADOS DO CLIENTE ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        if(this.quantidadeComputadores > 1)
            System.out.println("\n=== COMPUTADORES ADQUIRIDOS ===");
        else
            System.out.println("\n=== COMPUTADOR ADQUIRIDO ===");
        for (int i = 0; i < this.quantidadeComputadores; i++)
            this.computadores[i].mostraPCConfigs();
    }

    // Permite que a classe ProcessarPedido receba o array sem necessitar do getComputadores()
    public Computador[] obtemComputadores() {
        return this.computadores;
    }
}