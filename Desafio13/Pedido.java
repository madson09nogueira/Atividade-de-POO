public class Pedido {
    int numero;
    String cliente;
    Produto produto;
    int quantidade;

    public Pedido(int numero, String cliente, Produto produto, int quantidade) {
        this.numero = numero;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    double calcularSubtotal(){
        double subtotal = produto.preco * quantidade;
        return subtotal;
    }

    double calcularDesconto(){
        double desconto;
        double subtotal = calcularSubtotal();
        if (subtotal < 100) {
            desconto = 0;
        } else if (subtotal < 200) {
            desconto = 0.05;
        } else {
            desconto = 0.10;
        }
        return desconto;
    }

    double calcularTotal() {
        double desconto = calcularDesconto();
        double subtotal = calcularSubtotal();
        double total = subtotal - (subtotal * desconto);
        return total;
    }
}