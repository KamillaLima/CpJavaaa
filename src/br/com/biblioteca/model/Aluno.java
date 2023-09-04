package br.com.biblioteca.model;

import br.com.biblioteca.main.Aviso;

public class Aluno implements Aviso{
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	@Override
    public void notificarDisponibilidade(Livro livro) {
        System.out.println(nome + ",o livro " + livro.getTitulo() + " está disponível!!! Não perca tempo");
       
    }
   
}