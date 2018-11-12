package srp;

public class DebitaConta{
    public double debitar(Conta c, double valor){

        return c.getValor() - valor; 
    }
}