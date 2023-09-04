package br.com.biblioteca.main;
import br.com.biblioteca.model.Aluno;
import br.com.biblioteca.model.Emprestimo;
import br.com.biblioteca.model.Livro;

public class Biblioteca {
    public static void main(String[] args) {
        Livro livro = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "12345", 1);
        Aluno aluno1 = new Aluno("João", 123);
        Aluno aluno2 = new Aluno("Maria", 456);

        EmprestimoFactory emprestimoFactory = new BibliotecaEmprestimoFactory();

        realizarEmprestimo(emprestimoFactory, aluno1, livro);
        realizarEmprestimo(emprestimoFactory, aluno2, livro);

        realizarDevolucao(aluno1, livro);

        Emprestimo emprestimo3 = realizarEmprestimo(emprestimoFactory, aluno2, livro);

        if (emprestimo3 != null) {
            System.out.println("O(a) aluno(a) " + aluno2.getNome() + " pegou emprestado o livro " + livro.getTitulo());
        } else {
            System.out.println("O livro " + livro.getTitulo() + " está indisponível, volte em outro momento.");
        }
    }

    private static Emprestimo realizarEmprestimo(EmprestimoFactory emprestimoFactory, Aluno aluno, Livro livro) {
        Emprestimo emprestimo = emprestimoFactory.criarEmprestimo(aluno, livro);

        if (emprestimo != null) {
            System.out.println("O(a) aluno(a) " + aluno.getNome() + " pegou emprestado o livro " + livro.getTitulo());
        } else {
            System.out.println("O livro " + livro.getTitulo() + " está indisponível, volte em outro momento.");
        }

        return emprestimo;
    }

    private static void realizarDevolucao(Aluno aluno, Livro livro) {
        livro.devolver();
        System.out.println("O(a) aluno(a) " + aluno.getNome() + " devolveu o livro " + livro.getTitulo());
    }
}
