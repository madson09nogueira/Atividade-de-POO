import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        OrdemServico ordem1 = null;

        int opcao;

        do {
        System.out.println("\n===== MENU =====");
        System.out.println("1-Abrir ordem de serviço");
        System.out.println("2-Consultar ordem de serviço");
        System.out.println("3-Sair");
        opcao = teclado.nextInt();

        if (opcao == 1) {
                if (ordem1 != null) {
                    System.out.println("\nJá existe uma ordem de serviço aberta**");
                } else {
                    teclado.nextLine();
                    System.out.println("\nDigite o nome do cliente:");
                    String nomeCliente = teclado.nextLine();
                    System.out.println("Digite o telefone do cliente:");
                    String telefone = teclado.nextLine();

                    System.out.println("Digite a placa do veículo:");
                    String placa = teclado.nextLine();
                    System.out.println("Digite o modelo do veículo:");
                    String modelo = teclado.nextLine();

                    System.out.println("\nEscolha o tipo de serviço:");
                    System.out.println("1-Reparo leve (R$80,00)");
                    System.out.println("2-Troca de óleo (R$120,00)");
                    System.out.println("3-Alinhamento e balanceamento (R$150,00)");
                    System.out.println("4-Revisão completa (R$350,00)");
                    System.out.println("5-Conserto de motor (R$800,00)");
                    int tipoServico = teclado.nextInt();
                    teclado.nextLine();

                    String descricao;
                    double valor;

                    switch (tipoServico) {
                        case 1:
                            descricao = "Reparo leve";
                            valor = 80;
                            break;
                        case 2:
                            descricao = "Troca de óleo";
                            valor = 120;
                            break;
                        case 3:
                            descricao = "Alinhamento e balanceamento";
                            valor = 150;
                            break;
                        case 4:
                            descricao = "Revisão completa";
                            valor = 350;
                            break;
                        case 5:
                            descricao = "Conserto de motor";
                            valor = 800;
                            break;
                        default:
                            descricao = "Serviço não especificado (R$100,00)";
                            valor = 100;
                    }

                    Cliente cliente1 = new Cliente(nomeCliente, telefone);
                    Veiculo veiculo1 = new Veiculo(cliente1, placa, modelo);
                    ordem1 = new OrdemServico(veiculo1, descricao, valor);
                    ordem1.abrirOrdem();

                    System.out.println("\nOrdem de serviço aberta**");
                }
            } else if (opcao == 2) {
                if (ordem1 == null) {
                    System.out.println("\nNenhuma ordem de serviço aberta**");
                } else {
                    System.out.println("\n" + ordem1.mostrarDados());

                    int subopcao;
                    do {
                        System.out.println("\n1-Voltar ao menu principal");
                        System.out.println("2-Finalizar ordem de serviço");
                        subopcao = teclado.nextInt();

                        if (subopcao == 1) {
                            System.out.println("\nVoltando ao menu...");
                        } else if (subopcao == 2) {
                            ordem1.finalizarOrdem();
                            System.out.println("\nOrdem de serviço finalizada**");
                            ordem1 = null;
                        } else {
                            System.out.println("\nOpção inválida**");
                        }

                    } while (subopcao != 1 && subopcao != 2);
                }
            } else if (opcao == 3) {
                System.out.println("\nSaindo...");
                break;
            }

        } while (opcao != 3);

        teclado.close();
    }
}