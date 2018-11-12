# LSP - Princípio de Substituição de Liskov

Sua definição mais usada diz que:

“Classes derivadas devem poder ser substituídas por suas classes base”

# Classes - como usam o LSP ? 

Podemos atribuir um objeto do tipo ContaCorrenteLSP ou do tipo ContaPoupancaLSP a uma referência do tipo ContaLSP. Toda a funcionalidade que é inerente à classe base ContaLSP, e é adquirida por ContaCorrenteLSP e ContaPoupancaLSP via herança, pode ser invocada em uma referência do tipo ContaLSP. É possível invocar métodos como descontar() em uma referência de ContaLSP que, na verdade, contém um objeto ContaCorrenteLSP / ContaPoupancaLSP. A implementação sobrescrita do objeto real desses métodos será realmente invocada. Isto é exatamente o que o Princípio de Substituição de Liskov também declara - objetos de subtipo podem substituir objetos de supertipo sem afetar a funcionalidade inerente ao supertipo.



