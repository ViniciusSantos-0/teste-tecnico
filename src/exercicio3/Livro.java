package exercicio3;

public class Livro {
    private String titulo;
    private int qtdPaginas;
    private int paginasLidas;

    public Livro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

    public double verificarProgresso(){
        double porcentagem = (getQtdPaginas()*getPaginasLidas())/100;

        return porcentagem;
    }

    public int adicionarPaginas(){
        return 0;
    }

}
