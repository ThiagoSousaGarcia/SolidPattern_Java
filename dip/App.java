import java.util.ArrayList;
import java.util.List;

public class App{
	public static void main(String[] args) {
		
		/*Testando DIP*/ 
        ContaCorrenteDIP contaCorrenteDIP = new ContaCorrenteDIP(100);
        ContaPoupancaDIP contaPoupancaDIP = new ContaPoupancaDIP(200);
        List<ContaDIP> contaDIPs = new ArrayList<ContaDIP>();
        
        contaDIPs.add(contaCorrenteDIP);
        contaDIPs.add(contaPoupancaDIP);
       
        System.out.println("TESTANDO DIP");
        System.out.println("-----------------"); 
        
        Banco b = new Banco(contaDIPs);
        
        System.out.println("Os saldos das contas contidas no banco são: ");
        b.mostrar_todossaldos();
        
        b.descontos_totais();
        System.out.println("-----------------");
        
        System.out.println("Os saldos das contas contidas no banco após os descontos são: ");
        b.mostrar_todossaldos();
        System.out.println("-----------------"); 
	}
}