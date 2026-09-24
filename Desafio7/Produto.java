public class Produto {
    String codigo;
    String nome;
    double preco;
    int estoque;

    public Produto (String codigo, String nome, double preco, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    boolean adicionarEstoque(int quantidade){
        if (quantidade > 0) {
            estoque = estoque + quantidade;
            return true;   
        } else {
            return false;    
        }
    }

    boolean vender(int quantidade){
    if (quantidade > 0 && quantidade <= estoque) {
        estoque = estoque - quantidade;
        return true;  
    } else {
        return false; 
    }
}

    int consultarEstoque(){
        return estoque;
    }

    double calcularValorEstoque(){
        return preco * estoque;
    }
}