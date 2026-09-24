public class Aluno {
    String nome;
    String matricula;
    double nota1;
    double nota2;
    double nota3;

    public Aluno (String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    double calcularMedia() {
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }

    String verificarAprovacao() {
        double media = calcularMedia();

        if (media >= 6) {
            return "Você foi aprovado!";
        } else if (media >= 4 && media < 6) {
            return "Você está de recuperação!";
        } else {
            return "Você foi reprovado!";
        }
    }

    String mostrarDados() {
        return "Nome: " + nome
            +   "\nMatricula: " + matricula
            +    "\n "
            +   "\nSuas notas:" 
            +   "\nNota 1: " + nota1 
            +   "\nNota 2: " + nota2 
            +   "\nNota 3: " + nota3;
    }
}
