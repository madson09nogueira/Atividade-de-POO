import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Funcionario funcionario1 = new Funcionario("Maicon", "Garoto que progama", 67000);
        System.out.println("\n=============== DADOS DO FUNCIONÁRIO ===============");
        System.out.println(funcionario1.mostrarDados());

        int opcao;
        
        do {
        System.out.println("\n===== MENU =====");
        System.out.println("1-Ver dados");
        System.out.println("2-Adicionar aumento");
        System.out.println("3-Ver salário anual");
        System.out.println("4-Sair");
        opcao = teclado.nextInt();
        
        if (opcao == 1) {
                System.out.println("\n" + funcionario1.mostrarDados());
        } else if (opcao == 2) {
                System.out.println("\nDigite a porcentagem de aumento:");
                double aumento = teclado.nextDouble();
                System.out.println("\nAumento aplicado**");
                System.out.println("Novo salário: R$" + funcionario1.calcularAumento(aumento));
        } else if (opcao == 3) {
                System.out.println("\nSalário anual: R$" + funcionario1.calcularSalarioAnual());
        } else if (opcao == 4) {
                System.out.println("\nSaindo...");
                break;
        }

        } while (opcao != 4);

        teclado.close();
    }
}