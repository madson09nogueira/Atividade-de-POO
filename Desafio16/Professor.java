public class Professor {
    String nome;
    String especialidade;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    String mostrarDados(){
        return "Professor: " + nome
        +      "\nEspecialidade: " + especialidade;
    }
}