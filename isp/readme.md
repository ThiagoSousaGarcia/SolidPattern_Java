# ISP -  Princípio da Segregação de Interface

 O Princípio da Segregação de Interface trata da coesão de interfaces e diz que clientes não devem ser forçados a depender de métodos que não usam.

 # Classes - Como usam o ISP ? 

 Foram criadas duas interfaces distintas, InterfaceJuridica e InterfaceFisica, para que não haja um desperdício de declarações, pois se criassemos somente uma interface com todos metodos para todos os tipos de descontos as classes ContaPessoaFisica e ContaPessoaJuridica iriam declarar métodos que não seriam utilizados, logo foram criadas interfaces específicas para cada tipo de desconto. 