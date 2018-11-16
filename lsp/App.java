public class App  {
	public static void main(String[] args) {
		
		/*Testando LSP*/
        ContaLSP c2 = new ContaCorrenteLSP(30);
        ContaLSP c3 = new ContaPoupancaLSP(30);
        
        System.out.println("TESTANDO LSP");
        System.out.println("-----------------");
        System.out.println("O valor da conta corrente após o desconto é : "+c2.descontar()); 
        System.out.println("-----------------");
        System.out.println("O valor da conta poupança após o desconto é : "+c3.descontar());
        System.out.println("-----------------");
	}
}