package exercicio3;

import java.util.List;

public class Leitor {

    private String nome;
    private Livro livroFavorito;
    private List <Livro> estanteLivros;

    public Leitor(String nome, Livro livroFavorito) {
        this.nome = nome;
        this.livroFavorito = livroFavorito;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro getLivroFavorito() {
        return livroFavorito;
    }

    public void setLivroFavorito(Livro livroFavorito) {
        this.livroFavorito = livroFavorito;
    }

    public List<Livro> getEstanteLivros() {
        return estanteLivros;
    }

    public void adicionarLivros(List<Livro> estanteLivros) {
        this.estanteLivros = estanteLivros;
    }


    public void removerLivro(Livro livro){
        estanteLivros.remove(livro);
        livro.setPaginasLidas(0);
        System.out.println("Livro removido da estante com sucesso!");
    }
}
