public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Lorran", "40028922", 6, 7.5, 4.5);
        System.out.println("\n=============== SUA MÉDIA ===============");
        System.out.println(aluno1.mostrarDados());
        System.out.println("\nMédia final: " + aluno1.calcularMedia());
        System.out.println(aluno1.verificarAprovacao());
    }
}
