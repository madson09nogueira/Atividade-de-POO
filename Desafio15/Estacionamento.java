public class Estacionamento {
    Veiculo veiculo;

    boolean registrarEntrada(String placa, String modelo, int horaEntrada) {
        if (veiculo == null) {
            veiculo = new Veiculo(placa, modelo, horaEntrada);
            return true;
        } else {
            return false;
        }
    }

    double calcularValor(int horaSaida) {
        int horas = horaSaida - veiculo.horaEntrada;
        double valor;
        if (horas <= 1) {
            valor = 10;
        } else if (horas < 9) {
            valor = 10 + (horas - 1) * 5;
        } else {
            valor = 50;
        }
        return valor;
    }

    double registrarSaida(int horaSaida) {
        if (veiculo != null) {
            double valor = calcularValor(horaSaida);
            veiculo = null;
            return valor;
        } else {
            return -1;
        }
    }
}