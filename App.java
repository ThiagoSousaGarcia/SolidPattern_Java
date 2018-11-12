import srp.*;
import ocp.*;
import lsp.*;
import isp.*;
import dip.*;
import java.util.ArrayList;
import java.util.List;

public class App{
    public  static void main(String args[]){
        
        /*Testando SRP*/
        Conta c = new Conta(15);
        DebitaConta d = new DebitaConta();
        double valor = d.debitar(c,10);
        
        System.out.println("TESTANDO SRP");
        System.out.println("-----------------");
        System.out.println("O valor da conta após o débito é  "+ valor);
        System.out.println("-----------------");

        /*Testando OCP*/
        ContaCorrente cc = new ContaCorrente(20);
        ContaPoupanca cp = new ContaPoupanca(25);
        double descontop = cp.descontar();
        double descontoc = cc.descontar();
        
        System.out.println("TESTANDO OCP");
        System.out.println("-----------------");
        System.out.println("O valor da conta corrente após o desconto é : "+descontoc);
        System.out.println("-----------------");
        System.out.println("O valor da conta poupança após o desconto é : "+descontop);
        System.out.println("-----------------");

        /*Testando LSP*/
        ContaLSP c2 = new ContaCorrenteLSP(30);
        ContaLSP c3 = new ContaPoupancaLSP(30);
        
        System.out.println("TESTANDO LSP");
        System.out.println("-----------------");
        System.out.println("O valor da conta corrente após o desconto é : "+c2.descontar()); 
        System.out.println("-----------------");
        System.out.println("O valor da conta poupança após o desconto é : "+c3.descontar());
        System.out.println("-----------------");

        /*Testando ISP*/
        ContaPessoaFisica cpf = new ContaPessoaFisica(50);
        ContaPessoaJuridica cpj = new ContaPessoaJuridica(100);
        
        System.out.println("TESTANDO ISP");
        System.out.println("-----------------"); 
        System.out.println("O valor da conta de pessoa física após o desconto é : "+cpf.descontofisica());
        System.out.println("-----------------");
        System.out.println("O valor da conta de pessoa jurífica após o desconto é : "+cpj.descontojuridica());
        System.out.println("-----------------");

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