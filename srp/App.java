public class App {
	public static void main(String[] args) {
		/*Testando SRP*/
        Conta c = new Conta(15);
        DebitaConta d = new DebitaConta();
        
        double valor = d.debitar(c,10);
        
        System.out.println("TESTANDO SRP");
        System.out.println("-----------------");
        System.out.println("O valor da conta após o débito é  "+ valor);
        System.out.println("-----------------");
	}
	
}