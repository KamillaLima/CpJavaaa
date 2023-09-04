package br.com.biblioteca.model;

public class Livro {
	 private String titulo;
	    private String autor;
	    private String isbn;
	    private int quantidadeDisponivel;

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

	    public boolean emprestar() {
	        if (quantidadeDisponivel > 0) {
	            quantidadeDisponivel--;
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public void devolver() {
	        quantidadeDisponivel++;
	    }

		@Override
		public String toString() {
			return "Livro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", quantidadeDisponivel="
					+ quantidadeDisponivel + "]";
		}
	    
	    
}
