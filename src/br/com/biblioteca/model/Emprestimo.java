package br.com.biblioteca.model;

public class Emprestimo {
	 private Aluno aluno;
	    private Livro livro;

	    public Emprestimo(Aluno aluno, Livro livro) {
	        this.aluno = aluno;
	        this.livro = livro;
	    }

	    public void devolver() {
	        livro.devolver();
	    }
}
