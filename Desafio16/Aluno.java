public class Aluno {
    String nome;
    String matricula;
    Curso curso;

    public Aluno(String nome, String matricula, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    String mostrarDados(){
        return "Nome do aluno: " + nome
        +      "\nMatrícula: " + matricula
        +      "\nCurso: " + curso.nome;
    }
}