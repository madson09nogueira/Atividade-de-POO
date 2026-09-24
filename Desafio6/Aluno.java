public class Aluno {
    String nome;
    String matricula;

    public Aluno (String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    double calcularMedia(double... notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}