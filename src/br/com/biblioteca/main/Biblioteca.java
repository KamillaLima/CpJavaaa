package br.com.biblioteca.main;

import br.com.biblioteca.model.Aluno;
import br.com.biblioteca.model.Emprestimo;
import br.com.biblioteca.model.Livro;

public class Biblioteca {
	public static void main(String[] args) {
		Livro livro = new Livro("Principio de Poções", "Severus Snape", "12345", 1);
		Aluno aluno1 = new Aluno("Harry", 756);
		Aluno aluno2 = new Aluno("Hermione", 627);
		livro.registrarObservador(aluno1);
		livro.registrarObservador(aluno2);
		EmprestimoFactory emprestimoFactory = new BibliotecaEmprestimoFactory();

		System.out.println("Biblioteca de Hogwarts");

		// Ações
		realizarEmprestimo(emprestimoFactory, aluno1, livro);
		realizarEmprestimo(emprestimoFactory, aluno2, livro);
		realizarDevolucao(aluno1, livro);
		Emprestimo emprestimo = realizarEmprestimo(emprestimoFactory, aluno2, livro);

		if (emprestimo != null) {
			System.out.println("O(a) aluno(a) " + aluno2.getNome() + " pegou emprestado o livro " + livro.getTitulo());
		} else {
			System.out.println(" Sinto muito " + aluno2.getNome() + ",mas o livro " + livro.getTitulo()
					+ " está indisponível, volte em outro momento.");
		}
	}

	private static Emprestimo realizarEmprestimo(EmprestimoFactory emprestimoFactory, Aluno aluno, Livro livro) {
		Emprestimo emprestimo = emprestimoFactory.criarEmprestimo(aluno, livro);
		if (emprestimo != null) {
			System.out.println("O(a) aluno(a) " + aluno.getNome() + " pegou emprestado o livro " + livro.getTitulo());
		} else {
			System.out.println(" Sinto muito " + aluno.getNome() + ",mas o livro " + livro.getTitulo()
					+ " está indisponível, volte em outro momento.");
		}

		return emprestimo;
	}

	private static void realizarDevolucao(Aluno aluno, Livro livro) {
		livro.devolver();
		System.out.println("O(a) aluno(a) " + aluno.getNome() + " devolveu o livro " + livro.getTitulo());
	}
}
