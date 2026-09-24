public class Pedido {
    String nome;
    String produto;
    int quantidade;
    double preco;

    public Pedido (String nome, String produto, int quantidade, double preco) {
        this.nome = nome;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    double calcularSubtotal(){
        double subtotal = preco * quantidade;
        return subtotal;
    }

    double calcularDesconto(){
        double desconto;
        double subtotal = calcularSubtotal();
        if (subtotal < 50) {
            desconto = 0;
        } else if (subtotal < 100) {
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



