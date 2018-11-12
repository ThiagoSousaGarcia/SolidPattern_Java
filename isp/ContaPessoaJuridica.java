package isp;

public class ContaPessoaJuridica implements InterfaceJuridica{
    double saldo;

    public ContaPessoaJuridica(double saldo){
        this.saldo = saldo;
    }

    /*Supondo que a conta de pessoa jurídica é de 30% do saldo*/ 
    public double descontojuridica(){
        return this.saldo - 0.3*this.saldo;
    }
}