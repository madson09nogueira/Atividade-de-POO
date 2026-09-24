public class Main {
    public static void main(String[] args) {
    Corrida corrida1 = new Corrida("Bianca", 67);
        System.out.println("\n=============== SUA CORRIDA ===============");
        System.out.println("Passageiro: " + corrida1.passageiro);
        System.out.println("Distância: " + corrida1.distancia + " km");
        System.out.println("\nValor da corrida: R$" + corrida1.calcularCoridda());
    }
}