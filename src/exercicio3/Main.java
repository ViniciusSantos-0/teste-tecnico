package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Livro> listLivros = new ArrayList<>();
        Livro livro = new Livro();
        livro.setTitulo("Desbravando java");
        livro.setPaginasLidas(10);
        livro.setQtdPaginas(100);

        Livro livro2 = new Livro();
        livro2.setTitulo("Desbravando java Com orientação a objeto");
        livro2.setPaginasLidas(10);
        livro2.setQtdPaginas(100);

        listLivros.add(livro);
        listLivros.add(livro2);


        Leitor leitor = new Leitor("vinicius",livro);
        leitor.setLivroFavorito(livro);
        leitor.adicionarLivros(listLivros);


        System.out.println("---------Leitor--------------");
        System.out.println("Nome: "+ leitor.getNome());
        System.out.println("Livro favorito: "+ leitor.getLivroFavorito().getTitulo());
        System.out.println("Livros na estante: ");
        for(Livro l : leitor.getEstanteLivros()){
            System.out.println(l.getTitulo());
        };

    }
}
