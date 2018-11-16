import java.util.List;

public class Banco{

    public List<ContaDIP> contas;

    public Banco(List<ContaDIP> contas){
        this.contas = contas;
    }

    public void descontos_totais(){
        contas.forEach(c->c.descontar());        
    }
    public void mostrar_todossaldos(){
        contas.forEach(c->c.mostrar_saldo());
    }

}