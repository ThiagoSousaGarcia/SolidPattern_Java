package ocp;

public class ContaCorrente extends Debitar{
    double saldo;

    public ContaCorrente(double saldo){
        this.saldo = saldo;
    }

    /*Vamos supor que na conta corrente seja descontado 10% do saldo mensalmente*/ 
    public double descontar(){
        return this.saldo - 0.1*this.saldo;
    }
}