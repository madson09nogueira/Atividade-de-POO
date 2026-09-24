public class Main {
    public static void main(String[] args) {
    Aluno aluno1 = new Aluno("Lorran", 20, 70, 1.75);
        System.out.println("\n=============== DADOS DO ALUNO ===============");
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Idade: " + aluno1.idade);
        System.out.println("Peso: " + aluno1.peso);
        System.out.println("Altura: " + aluno1.altura);
        System.out.println("\nIMC: " + aluno1.calcularIMC());
        System.out.println("Classificação: " + aluno1.classificarIMC());
    }
}