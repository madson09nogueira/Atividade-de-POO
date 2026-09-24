import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Estacionamento estacionamento1 = new Estacionamento();

        int opcao;
        
        do {
        System.out.println("\n===== MENU =====");
        System.out.println("1-Registrar entrada");
        System.out.println("2-Registrar saída");
        System.out.println("3-Consultar veículo");
        System.out.println("4-Sair");
        opcao = teclado.nextInt();
        
        if (opcao == 1) {
                System.out.println("\nDigite a placa:");
                String placa = teclado.next();
                System.out.println("Digite o modelo:");
                String modelo = teclado.next();
                System.out.println("Digite a hora de entrada:");
                int horaEntrada = teclado.nextInt();
                if (estacionamento1.registrarEntrada(placa, modelo, horaEntrada)) {
                    System.out.println("\nEntrada registrada**");
                } else {
                    System.out.println("\nJá existe um veículo estacionado**");
                }
            } else if (opcao == 2) {
                System.out.println("\nDigite a hora de saída:");
                int horaSaida = teclado.nextInt();
                double valor = estacionamento1.registrarSaida(horaSaida);
                if (valor != -1) {
                    System.out.println("\nSaída registrada**");
                    System.out.println("Valor a pagar: " + valor);
                } else {
                    System.out.println("\nNenhum veículo estacionado**");
                }
            } else if (opcao == 3) {
                if (estacionamento1.veiculo != null) {
                    System.out.println("\nPlaca: " + estacionamento1.veiculo.placa);
                    System.out.println("Modelo: " + estacionamento1.veiculo.modelo);
                    System.out.println("Hora de entrada: " + estacionamento1.veiculo.horaEntrada);
                } else {
                    System.out.println("\nNenhum veículo estacionado**");
                }
            } else if (opcao == 4) {
                System.out.println("\nSaindo...");
                break;
            }

        } while (opcao != 4);

        teclado.close();
    }
}