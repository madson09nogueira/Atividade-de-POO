public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto (String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    double calcularTotal(){
        double total = preco * quantidade;
        double desconto = 0.10 * total;
        if(total > 100) {
            total -= desconto;
            return total;
        } else{
            return total;
        }
    }
}