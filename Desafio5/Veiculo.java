public class Veiculo {
    String placa;
    String modelo;
    int horasEstacionado;

    public Veiculo (String placa, String modelo, int horasEstacionado) {
        this.placa = placa;
        this.modelo = modelo;
        this.horasEstacionado = horasEstacionado;
    }

    double calcularValor(){
        double valor = 0;
        int hora = horasEstacionado;
        if (hora == 1) {
            valor = 10;
        } else if (hora >= 2 && hora < 9) {
            valor += (hora - 1) * 5;
        } else if (hora > 8) {
            valor = 50;
        }
        return valor;
    }
}
