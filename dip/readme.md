# DIP - Princípio da Inversão de Dependência

O DIP diz que:

– Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações;

– Abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.

Inverter a dependência faz com que um cliente não fique frágil a mudanças relacionadas a detalhes de 

implementação. Isto é, alterar o detalhe não quebra o cliente. Além disso, o mesmo cliente pode ser 

reutilizado com outro detalhe de implementação.

# Classes - Como usam o DIP ? 

A interface ContaDIP é utilizada para abstrair a ideia de contas.

As classes ContaCorrenteDIP e ContaPoupancaDIP são classes onde são implementadas os detalhes de cada tipo de conta que pode está presente em um Banco.

Já na classe Banco, é criada uma lista de ContaDIP, para que assim não precise depender dos detalhes de cada tipo de conta, dependendo somente da abstração de contas criada pela interface ContaDIP.