# OCP - Princípio do Aberto/Fechado

Definição:

“Entidades de software (classes, módulos, funções, etc.) devem ser abertas para extensão mas fechadas para modificação.”

# Classes - Como usam o OCP ? 

A classe abstrata Debitar é criada com o método descontar(), que é um método inerente a qualquer tipo de Conta que possa ser criada, logo podemos extender criando novas classes com novos tipos de conta, sem a necessidade de alterar o código existente.  