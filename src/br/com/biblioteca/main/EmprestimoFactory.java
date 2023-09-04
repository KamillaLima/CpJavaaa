package br.com.biblioteca.main;

import br.com.biblioteca.model.Aluno;
import br.com.biblioteca.model.Emprestimo;
import br.com.biblioteca.model.Livro;

interface EmprestimoFactory {
    Emprestimo criarEmprestimo(Aluno aluno, Livro livro);
}