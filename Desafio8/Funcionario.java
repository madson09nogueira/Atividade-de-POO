public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public Funcionario (String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    String mostrarDados() {
        return "Nome: " + nome
        + "\nCargo: " + cargo
        + "\nSalário: R$" + salario;    
    }

    double calcularAumento(double aumento) {
        salario = salario + salario * (aumento / 100);
        return salario;
    }

    double calcularSalarioAnual() {
        return salario * 12;
    }

}
