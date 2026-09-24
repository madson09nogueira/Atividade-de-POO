public class Aluno {
    String nome;
    int idade;
    double peso;
    double altura;
    double IMC;

    public Aluno (String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    double calcularIMC() {
        IMC = peso / (altura * altura);
        return IMC;
    }

    String classificarIMC() {
        calcularIMC();
        if (IMC < 18.5) {
            return "Abaixo do peso";
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            return "Peso normal";
        } else if (IMC >= 25 && IMC <= 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}
