public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Lorran", "40028922");
        Aluno aluno2 = new Aluno("Maicon", "40666");
        Aluno aluno3 = new Aluno("Neymar", "67676767");
        Aluno aluno4 = new Aluno("Gabigol", "20090909");
        Aluno aluno5 = new Aluno("Baggio", "17071994");

        System.out.println("\n=============== MÉDIAS DA TURMA ===============");
        System.out.println(aluno1.nome + " - Média: " + aluno1.calcularMedia(6, 7.5, 4.5));
        System.out.println(aluno2.nome + " - Média: " + aluno2.calcularMedia(8, 9, 7));
        System.out.println(aluno3.nome + " - Média: " + aluno3.calcularMedia(5, 6, 5.5, 7));
        System.out.println(aluno4.nome + " - Média: " + aluno4.calcularMedia(10, 9, 10));
        System.out.println(aluno5.nome + " - Média: " + aluno5.calcularMedia(4, 3, 5));
    }
}