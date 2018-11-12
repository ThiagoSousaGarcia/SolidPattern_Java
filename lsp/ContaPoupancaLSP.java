package lsp;

public class ContaPoupancaLSP extends ContaLSP{
    double saldo;

    public ContaPoupancaLSP(double saldo){
        this.saldo = saldo;
    }

    /*Vamos supor que na conta poupança, ao invés de descontar seja acrescentado 10% do saldo mensalmente*/ 
    public double descontar(){
        return this.saldo + 0.1*this.saldo;
    }
}