package br.com.biblioteca.main;

import br.com.biblioteca.model.Aluno;
import br.com.biblioteca.model.Emprestimo;
import br.com.biblioteca.model.Livro;

class BibliotecaEmprestimoFactory implements EmprestimoFactory {
	
    public Emprestimo criarEmprestimo(Aluno aluno, Livro livro) {
        if (livro.emprestar() && aluno != null  ) {
            return new Emprestimo(aluno, livro);
        } else {
            return null;
        }
    }

	
}
