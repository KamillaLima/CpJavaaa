Kamilla de Lima Rodrigues  RM96112
2TDST

Factory Method Pattern:
Na Biblioteca de Hogwarts, usamos o Factory Method por meio da interface EmprestimoFactory. Essa interface define um método chamado criarEmprestimo, que cria empréstimos. O método recebe dois argumentos: o aluno que quer pegar o livro emprestado e o livro em si. Essa abordagem torna o código mais flexível e classes mais simples e objetivas.
Observer Pattern:
A interface Aviso declara o método notificarDisponibilidade(livro).
A classe Aluno implementa a interface Aviso, permitindo que os alunos recebam notificações quando um livro estiver disponível.
A classe Livro mantém uma lista de alunos que desejam ser notificados quando o livro estiver disponível. Quando o livro é emprestado com sucesso, ele notifica automaticamente os alunos inscritos.
No método main da classe Biblioteca, os alunos são registrados como observadores para um livro específico, permitindo que saibam imediatamente quando o livro que desejam está pronto para ser emprestado.