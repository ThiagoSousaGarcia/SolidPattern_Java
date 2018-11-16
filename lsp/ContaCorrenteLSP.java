public class ContaCorrenteLSP extends ContaLSP{
    double saldo;

    public ContaCorrenteLSP(double saldo){
        this.saldo = saldo;
    }

    /*Vamos supor que na conta corrente seja descontado 10% do saldo mensalmente*/ 
    public double descontar(){
        this.saldo = this.saldo - 0.1*this.saldo; 
        
        return this.saldo;
    }
}
