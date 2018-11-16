public class ContaCorrenteDIP implements ContaDIP{
    double saldo;

    public ContaCorrenteDIP(double saldo){
        this.saldo = saldo;
    }

    public double descontar(){
         return descontar_contacorrente();
    }

    public void mostrar_saldo(){
        System.out.println(this.saldo);
    }

    /*Vamos supor que na conta corrente seja descontado 10% do saldo mensalmente*/ 
    public double descontar_contacorrente(){
        this.saldo = this.saldo-0.1*this.saldo;

        return this.saldo;

    }
}


