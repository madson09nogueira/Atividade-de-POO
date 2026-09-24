public class Disciplina {
    String nome;
    int cargaHoraria;

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    String mostrarDados(){
        return "Disciplina: " + nome
        +      "\nCarga horária: " + cargaHoraria;
    }
}