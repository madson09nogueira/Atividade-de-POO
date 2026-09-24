import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 6767, true);
        System.out.println("\n=============== BIBLIOTECA ===============");
        System.out.println(livro1.mostrarDados());

        int opcao;
        
        do {
        System.out.println("\n===== MENU =====");
        System.out.println("1-Emprestar");
        System.out.println("2-Devolver");
        System.out.println("3-Ver dados");
        System.out.println("4-Sair");
        opcao = teclado.nextInt();
        
        if (opcao == 1) {
                if (livro1.emprestar()) {
                    System.out.println("\nLivro emprestado**");
                } else {
                    System.out.println("\nLivro já está emprestado**");
                }
            } else if (opcao == 2) {
                if (livro1.devolver()) {
                    System.out.println("\nLivro devolvido**");
                } else {
                    System.out.println("\nLivro já está disponível**");
                }
            } else if (opcao == 3) {
                System.out.println("\n" + livro1.mostrarDados());
            } else if (opcao == 4) {
                System.out.println("\nSaindo...");
                break;
            }

        } while (opcao != 4);

        teclado.close();
    }
}