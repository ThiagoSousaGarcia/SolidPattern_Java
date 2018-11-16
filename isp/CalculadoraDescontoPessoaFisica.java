public class CalculadoraDescontoPessoaFisica implements InterfaceFisica{
	public double descontofisica(ContaPessoaFisica cpf){
		
		if (cpf.getSaldo()>2896) {
			 cpf.setSaldo(cpf.getSaldo()-cpf.getSaldo()*0.25);
			 return cpf.getSaldo();
		}else{
			cpf.setSaldo(cpf.getSaldo()-cpf.getSaldo()*0.20);
			return cpf.getSaldo();
		}
	}
}