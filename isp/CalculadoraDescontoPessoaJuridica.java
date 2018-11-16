public class CalculadoraDescontoPessoaJuridica implements InterfaceJuridica{
	public double descontojuridica(ContaPessoaJuridica cpj){
		
		/*Supondo que pessoa juridica tem desconto de 30% com saldo acima de 3000, caso contrário o desconto é de 25 %*/
		if (cpj.getSaldo()>3000) {
			 cpj.setSaldo(cpj.getSaldo()-cpj.getSaldo()*0.30);
			 return cpj.getSaldo();
		}else{
			cpj.setSaldo(cpj.getSaldo()-cpj.getSaldo()*0.25);
			return cpj.getSaldo();
		}
	}
}