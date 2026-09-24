public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 120);
        Pedido pedido1 = new Pedido(1, "Lorranzinho", produto1, 2);
        System.out.println("\n=============== SEU PEDIDO ===============");
        System.out.println("Número do pedido: " + pedido1.numero);
        System.out.println("Cliente: " + pedido1.cliente);
        System.out.println("Produto: " + pedido1.produto.nome);
        System.out.println("Quantidade: " + pedido1.quantidade);
        System.out.println("\nSubtotal: R$" + pedido1.calcularSubtotal());
        System.out.println("Desconto: " + (pedido1.calcularDesconto() * 100) + "%");
        System.out.println("Total: R$" + pedido1.calcularTotal());
    }
}