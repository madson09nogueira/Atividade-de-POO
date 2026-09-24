public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso("Desenvolvimento de Sistemas", 67000);
    Aluno aluno1 = new Aluno("Lorran", "40028922", curso1);
        System.out.println("\n=============== DADOS DO ALUNO ===============");
        System.out.println(aluno1.mostrarDados());
        System.out.println("\nCarga horária do curso: " + aluno1.curso.cargaHoraria + " horas");
    }
}