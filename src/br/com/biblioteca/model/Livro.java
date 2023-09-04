package br.com.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

import br.com.biblioteca.main.Aviso;

public class Livro {
	 private String titulo;
	    private String autor;
	    private String isbn;
	    private int quantidadeDisponivel;
	    private List<Aviso> avisosLivro = new ArrayList<>();
	    
	    public Livro(String titulo, String autor, String isbn, int quantidadeDisponivel) {
	        this.titulo = titulo;
	        this.autor = autor;
	        this.isbn = isbn;
	        this.quantidadeDisponivel = quantidadeDisponivel;
	    }

	    public String getTitulo() {
	        return titulo;
	    }

	    public String getAutor() {
	        return autor;
	    }

	    public String getIsbn() {
	        return isbn;
	    }

	    public int getQuantidadeDisponivel() {
	        return quantidadeDisponivel;
	    }
	    
	    private void notificarObservadores() {
	        for (Aviso aviso : avisosLivro) {
	        	aviso.notificarDisponibilidade(this);
	        }
	    }

	    public boolean emprestar() {
	        if (quantidadeDisponivel > 0) {
	            quantidadeDisponivel--;
	            notificarObservadores();
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public void devolver() {
	        quantidadeDisponivel++;
	    }
	    
	    public void registrarObservador(Aviso aviso) {
	    	avisosLivro.add(aviso);
	    }

	    public void cancelarInscricao(Aviso aviso) {
	    	avisosLivro.remove(aviso);
	    }


		@Override
		public String toString() {
			return "Livro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", quantidadeDisponivel="
					+ quantidadeDisponivel + "]";
		}
	    
	    
}
