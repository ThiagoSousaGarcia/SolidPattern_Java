public class App{
	public static void main(String[] args) {
		
	/*Testando ISP*/
        ContaPessoaFisica cpf = new ContaPessoaFisica(3000);
        CalculadoraDescontoPessoaFisica cdpf = new CalculadoraDescontoPessoaFisica();

        ContaPessoaJuridica cpj = new ContaPessoaJuridica(3500);
        CalculadoraDescontoPessoaJuridica cdpj = new CalculadoraDescontoPessoaJuridica();

        
        System.out.println("TESTANDO ISP");
        System.out.println("-----------------"); 
        System.out.println("O valor da conta de pessoa física após o desconto é : "+cdpf.descontofisica(cpf));
        System.out.println("-----------------");
        System.out.println("O valor da conta de pessoa jurífica após o desconto é : "+cdpj.descontojuridica(cpj));
        System.out.println("-----------------");

	}

}