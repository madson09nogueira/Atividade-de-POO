public class Conta {
    String titular;
    double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
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
        if (saque > 0 && saque <= saldo) {
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
