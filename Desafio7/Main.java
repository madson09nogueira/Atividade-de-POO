import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Produto produto1 = new Produto("MVLM", "Mouse Gamer", 80, 20);
        System.out.println("\n=============== SEU PRODUTO ===============");
        System.out.println("Nome: " + produto1.nome);
        System.out.println("Estoque atual: " + produto1.estoque);

        int opcao;
        
        do {
        System.out.println("\n===== MENU =====");
        System.out.println("1-Adicionar estoque");
        System.out.println("2-Vender");
        System.out.println("3-Consultar estoque");
        System.out.println("4-Valor total do estoque");
        System.out.println("5-Sair");
        opcao = teclado.nextInt();
        
        if (opcao == 1) {
                System.out.println("\nDigite a quantidade a adicionar:");
                int quantidade = teclado.nextInt();
                if (produto1.adicionarEstoque(quantidade)) {
                    System.out.println("\nEstoque atualizado**");
                    System.out.println("Estoque atual: " + produto1.consultarEstoque());
                } else {
                    System.out.println("\nQuantidade inválida**");
                }
            } else if (opcao == 2) {
                System.out.println("\nDigite a quantidade a vender:");
                int quantidade = teclado.nextInt();
                if (produto1.vender(quantidade)) {
                    System.out.println("\nVenda realizada**");
                    System.out.println("Estoque atual: " + produto1.consultarEstoque());
                } else {
                    System.out.println("\nEstoque insuficiente**");
                }
            } else if (opcao == 3) {
                System.out.println("\nEstoque atual: " + produto1.consultarEstoque());
            } else if (opcao == 4) {
                System.out.println("\nValor total do estoque: r$" + produto1.calcularValorEstoque());
            } else if (opcao == 5) {
                System.out.println("\nSaindo...");
                break;
            }

        } while (opcao != 5);

        teclado.close();
    }
}