public class MemoriaUSB {
    private String nome;
    private int capacidade;

    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    //Mostrando as informações do usb
    public void mostraInfo() {
        System.out.println("Acompanha: " + this.nome + " de " + this.capacidade + "Gb");
    }
}