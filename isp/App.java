public class App{
	public static void main(String[] args) {
		
		/*Testando ISP*/
        ContaPessoaFisica cpf = new ContaPessoaFisica(50);
        ContaPessoaJuridica cpj = new ContaPessoaJuridica(100);
        
        System.out.println("TESTANDO ISP");
        System.out.println("-----------------"); 
        System.out.println("O valor da conta de pessoa física após o desconto é : "+cpf.descontofisica());
        System.out.println("-----------------");
        System.out.println("O valor da conta de pessoa jurífica após o desconto é : "+cpj.descontojuridica());
        System.out.println("-----------------");

	}

}