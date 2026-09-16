public class HardwareBasico {
    private String nome;
    private float capacidade;

    public HardwareBasico(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }


    ///
    public void mostraInfo() {
        if (this.nome.contains("Pentium") || this.nome.contains("Core")) {
            System.out.println(" - " + this.nome + ": " + (int)this.capacidade + " Mhz");
        } else if (this.nome.contains("Memória RAM")) {
            System.out.println(" - " + this.nome + ": " + (int)this.capacidade + " Gb");
        } else if (this.nome.contains("HD")) {
            if (this.capacidade >= 1000) {
                System.out.println(" - " + this.nome + ": " + (int)(this.capacidade / 1000) + " Tb");
            } else {
                System.out.println(" - " + this.nome + ": " + (int)this.capacidade + " Gb");
            }
        } else {
            System.out.println(" - " + this.nome + ": " + this.capacidade);
        }
    }
}