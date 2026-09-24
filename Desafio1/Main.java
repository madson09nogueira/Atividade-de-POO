public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("leite", 15, 5);
        System.out.println("\n=============== SUA COMPRA ===============");
        System.out.println("Produto: " + produto1.nome);
        System.out.println("Valor total: " + produto1.calcularTotal());
    }
}