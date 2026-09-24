public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("GOAT67", "Peugeot 206", 3);
        System.out.println("\n=============== SEU VEÍCULO ===============");
        System.out.println("Placa: " + veiculo1.placa);
        System.out.println("Modelo: " + veiculo1.modelo);
        System.out.println("Horas estacionado: " + veiculo1.horasEstacionado);
        System.out.println("\nValor a pagar: R$" + veiculo1.calcularValor());
    }
}