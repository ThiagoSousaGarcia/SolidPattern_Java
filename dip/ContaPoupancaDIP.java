public class ContaPoupancaDIP implements ContaDIP{
    double saldo;

    public ContaPoupancaDIP(double saldo){
        this.saldo = saldo;
    }
    
    public double descontar(){
        return descontar_contapoupanca();
    }

    public void mostrar_saldo(){
        System.out.println(this.saldo);
    }

    /*Vamos supor que na conta poupança, ao invés de descontar seja acrescentado 10% do saldo mensalmente*/ 
    public double descontar_contapoupanca(){
        this.saldo = this.saldo + 0.1*this.saldo; 

        return this.saldo;
    }
}