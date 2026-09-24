import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Conta conta1 = new Conta("Maicon", 50);
        System.out.println("\n=============== SUA CONTA ===============");
        System.out.println("Nome: " + conta1.titular);
        System.out.println("Seu saldo: " + conta1.saldo);

        int opcao;
        
        do {
        System.out.println("\n===== MENU =====");
        System.out.println("1-Depositar");
        System.out.println("2-Sacar");
        System.out.println("3-Consultar saldo");
        System.out.println("4-Sair");
        opcao = teclado.nextInt();
        
        if (opcao == 1) {
                System.out.println("\nDigite o valor a depositar:");
                double valor = teclado.nextDouble();
                if (conta1.depositar(valor)) {
                    System.out.println("\nDepósito realizado**");
                    System.out.println("Novo saldo: R$" + conta1.consultarSaldo());
                } else {
                    System.out.println("\nValor inválido**");
                }
            } else if (opcao == 2) {
                System.out.println("\nDigite o valor a sacar:");
                double valor = teclado.nextDouble();
                if (conta1.sacar(valor)) {
                    System.out.println("\nSaque realizado**");
                    System.out.println("Novo saldo: R$" + conta1.consultarSaldo());
                } else {
                    System.out.println("\nSaldo insuficiente ou valor inválido**");
                }
            } else if (opcao == 3) {
                System.out.println("\nSeu saldo atual: R$" + conta1.consultarSaldo());
            } else if (opcao == 4) {
                System.out.println("\nSaindo...");
                break;
            }

        } while (opcao != 4);

        teclado.close();
    }
}