import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno aluno1 = null;
        Curso curso1 = null;
        Disciplina disciplina1 = null;
        Professor professor1 = null;

        int opcao;

        do {
        System.out.println("\n===== MENU =====");
        System.out.println("1-Cadastrar curso");
        System.out.println("2-Cadastrar aluno");
        System.out.println("3-Cadastrar disciplina");
        System.out.println("4-Cadastrar professor");
        System.out.println("5-Mostrar aluno");
        System.out.println("6-Mostrar curso");
        System.out.println("7-Sair");
        opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("\nDigite o nome do curso:");
                teclado.nextLine();
                String nomeCurso = teclado.nextLine();
                System.out.println("Digite a carga horária:");
                int cargaCurso = teclado.nextInt();
                curso1 = new Curso(nomeCurso, cargaCurso);
                System.out.println("\nCurso cadastrado**");
                break;

            case 2:
                if (curso1 == null) {
                    System.out.println("\nCadastre um curso antes**");
                } else {
                    System.out.println("\nDigite o nome do aluno:");
                    teclado.nextLine();
                    String nomeAluno = teclado.nextLine();
                    System.out.println("Digite a matrícula:");
                    String matricula = teclado.nextLine();
                    aluno1 = new Aluno(nomeAluno, matricula, curso1);
                    System.out.println("\nAluno cadastrado**");
                }
                break;

            case 3:
                System.out.println("\nDigite o nome da disciplina:");
                teclado.nextLine();
                String nomeDisciplina = teclado.nextLine();
                System.out.println("Digite a carga horária:");
                int cargaDisciplina = teclado.nextInt();
                disciplina1 = new Disciplina(nomeDisciplina, cargaDisciplina);
                System.out.println("\nDisciplina cadastrada**");
                break;

            case 4:
                System.out.println("\nDigite o nome do professor:");
                teclado.nextLine();
                String nomeProfessor = teclado.nextLine();
                System.out.println("Digite a especialidade:");
                String especialidade = teclado.nextLine();
                professor1 = new Professor(nomeProfessor, especialidade);
                System.out.println("\nProfessor cadastrado**");
                break;

            case 5:
                if (aluno1 == null) {
                    System.out.println("\nNenhum aluno cadastrado**");
                } else {
                    System.out.println("\n" + aluno1.mostrarDados());
                }
                break;

            case 6:
                if (curso1 == null) {
                    System.out.println("\nNenhum curso cadastrado**");
                } else {
                    System.out.println("\n" + curso1.mostrarDados());
                }
                break;

            case 7:
                System.out.println("\nSaindo...");
                break;

            default:
                System.out.println("\nOpção inválida**");
        }

        } while (opcao != 7);

        teclado.close();
    }
}