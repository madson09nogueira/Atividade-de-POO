public class OrdemServico {
    Veiculo veiculo;
    String descricaoServico;
    double valor;
    boolean status;

    public OrdemServico (Veiculo veiculo, String descricaoServico, double valor) {
        this.veiculo = veiculo;
        this.descricaoServico = descricaoServico;
        this.valor = valor;
    }

    boolean abrirOrdem() {
        if (!status) {
            status = true;
            return true;
        } else { 
            return false;
        }
    }

    boolean finalizarOrdem() {
        if (status) {
            status = false;
            return true;
        } else {
            return false;
        }
    }

    String mostrarDados() {
        String ordem;
        if (status) {
            ordem = "Aberta";
        } else {
            ordem = "Finalizada";
        }

        return "Cliente: " + veiculo.cliente.nome
        +      "\nModelo do veículo: " + veiculo.modelo
        +      "\nplaca: " + veiculo.placa
        +      "\nStatus: " + ordem
        +      "\nValor do serviço: R$" + valor;
            
    }
}
