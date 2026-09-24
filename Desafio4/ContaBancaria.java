public class ContaBancaria {
    String titular;
    int numero;
    double saldo;

    public ContaBancaria (String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    boolean depositar(double quantia){
        if (quantia > 0) {
            saldo = saldo + quantia;
            return true;   
        } else {
            return false;    
        }
    }

    boolean sacar(double saque){
        if (saque <= saldo) {
            saldo = saldo - saque;
            return true;  
        } else {
            return false; 
        }
    }

    double consultarSaldo(){
        return saldo;
    }
}
