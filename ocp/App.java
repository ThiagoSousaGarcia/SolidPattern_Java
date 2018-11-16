public class App {
	public static void main(String[] args) {
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
	}
}