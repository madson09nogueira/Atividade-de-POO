public class Corrida {
    String passageiro;
    double distancia;

    public Corrida(String passageiro, double distancia) {
        this.passageiro = passageiro;
        this.distancia = distancia;
    }

    double calcularCoridda() {
        double valor = 5 + (distancia * 2.50);
        if (distancia > 20) {
            valor -= (valor * 0.10);
        }
        return valor;
    }
}
