public class ContaPessoaFisica implements InterfaceFisica{
    double saldo;

    public ContaPessoaFisica(double saldo){
        this.saldo = saldo;
    }

    /*Supondo que pessoa física tem desconto de 20% do saldo*/
    public double descontofisica(){
        this.saldo = this.saldo - 0.2*this.saldo;
        
        return this.saldo;
    }
}
