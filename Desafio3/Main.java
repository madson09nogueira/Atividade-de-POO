public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("Maicon", "X Tudo", 8, 15.50);
        System.out.println("\n=============== SEU PEDIDO ===============");
        System.out.println("Nome: " + pedido1.nome);
        System.out.println("Seu pedido: " + pedido1.produto);
        System.out.println("Valor total: " + pedido1.calcularTotal());
    }
}
