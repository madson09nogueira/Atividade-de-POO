public class Curso {
    String nome;
    int cargaHoraria;

    public Curso(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    String mostrarDados(){
        return "Curso: " + nome
        +      "\nCarga horária: " + cargaHoraria;
    }
}