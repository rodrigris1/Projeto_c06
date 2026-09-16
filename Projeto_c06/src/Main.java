//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// ler input do teclado
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float matricula = 988;

        // Configuração da Promoção 1
        Computador promo1 = new Computador("Apple", matricula, "macOS Sequoia", 64);
        promo1.addHardwareBasico(new HardwareBasico("Pentium Core i5", 2200));
        promo1.addHardwareBasico(new HardwareBasico("Memória RAM", 8));
        promo1.addHardwareBasico(new HardwareBasico("HD", 500));
        promo1.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        // Configuração da Promoção 2
        Computador promo2 = new Computador("Samsung", matricula + 1, "Windows 8", 64);
        promo2.addHardwareBasico(new HardwareBasico("Pentium Core i7", 3370));
        promo2.addHardwareBasico(new HardwareBasico("Memória RAM", 16));
        promo2.addHardwareBasico(new HardwareBasico("HD", 1000));
        promo2.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        // Configuração da Promoção 3
        Computador promo3 = new Computador("Dell", matricula + 2, "Windows 10", 64);
        promo3.addHardwareBasico(new HardwareBasico("Pentium Core i7", 4500));
        promo3.addHardwareBasico(new HardwareBasico("Memória RAM", 32));
        promo3.addHardwareBasico(new HardwareBasico("HD", 2000));
        promo3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        // Cadastro do Cliente
        Cliente cliente = new Cliente("Cristiano Ronaldo Siu", "777.777.777-77");

        System.out.println("=== BEM-VINDO À PC MANIA ===");
        System.out.println("Digite o código da promoção desejada (1, 2 ou 3) ou 0 para encerrar:");

        //saídas
        int opcao = -1;
        while (opcao != 0) {
            System.out.print("Código da promoção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cliente.comprarComputador(promo1);
                    System.out.println("Promoção 1 adicionada ao carrinho!");
                    break;
                case 2:
                    cliente.comprarComputador(promo2);
                    System.out.println("Promoção 2 adicionada ao carrinho!");
                    break;
                case 3:
                    cliente.comprarComputador(promo3);
                    System.out.println("Promoção 3 adicionada ao carrinho!");
                    break;
                case 0:
                    System.out.println("Finalizando compra...");
                    break;
                default:
                    System.out.println("Não temos em estoque!");
                    break;
            }
        }

        // Exibição de dados do cliente e produtos
        cliente.mostrarCarrinho();
        System.out.println("TOTAL DA COMPRA: R$ " + cliente.calculaTotalCompra());

        // Processamento do pedido
        ProcessarPedido.processar(cliente.obtemComputadores());

        scanner.close();
    }
}