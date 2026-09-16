public class Computador {

    private String marca;
    private float preco;
    private SistemaOperacional sistemaOperacional;
    private HardwareBasico[] hardwares;
    private MemoriaUSB memoriaUSB;
    private int quantidadeHardwares;

    public Computador(String marca, float preco, String soNome, int soTipo){

        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = new SistemaOperacional(soNome, soTipo);
        this.hardwares = new HardwareBasico[10];
        this.quantidadeHardwares = 0;

    }

    public void addHardwareBasico(HardwareBasico hb){

        if(this.quantidadeHardwares < this.hardwares.length){

            this.hardwares[this.quantidadeHardwares] = hb;
            this.quantidadeHardwares++;
        }
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Preço: R$ " + this.preco);

        // Em vez de usar get, delega a exibição para o próprio objeto
        this.sistemaOperacional.mostraInfo();

        System.out.println("Especificações do computador:");
        for (int i = 0; i < this.quantidadeHardwares; i++) {
            this.hardwares[i].mostraInfo();
        }

        if (this.memoriaUSB != null) {
            this.memoriaUSB.mostraInfo();
        }
        System.out.println("----------------------------------------");
    }
    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }
    public float retornaPreco() {
        return this.preco;

}
}