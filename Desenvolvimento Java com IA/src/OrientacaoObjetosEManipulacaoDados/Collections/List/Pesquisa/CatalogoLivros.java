package OrientacaoObjetosEManipulacaoDados.Collections.List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPeloAutor = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPeloAutor.add(l);
                }
            }
        }else {System.out.println("Catalogo vazio");}
        return livrosPeloAutor;
    }

    public List<Livro> pesquisarPorIntervalo(int anoInicial, int anoFinal){
        List<Livro> livrosDentroIntervalo = new ArrayList<>();
        if (!listaLivros.isEmpty()){
            for (Livro l : listaLivros) {
                if (l.getAno() >= anoInicial && l.getAno() <= anoFinal){livrosDentroIntervalo.add(l);}
            }
        }else {System.out.println("Catalogo vazio");}
        return livrosDentroIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroComTitulo = null;
        if (!listaLivros.isEmpty()){
            for (Livro l : listaLivros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroComTitulo = l; 
                    break;
                }
            }
        }else{System.out.println("Catalogo vazio");}
        return livroComTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Balacobaco", "Fonseca", 2021);
        catalogo.adicionarLivro("batatao", "Silva", 2021);
        catalogo.adicionarLivro("Um otario", "Fonseca", 1999);
        catalogo.adicionarLivro("Oque?", "Leo", 2019);
        catalogo.adicionarLivro("Kem?", "Santos", 2017);

        System.out.println(catalogo.pesquisarPorAutor("Fonseca"));
        System.out.println(catalogo.pesquisarPorIntervalo(1980, 2000));
        System.out.println(catalogo.pesquisarPorTitulo("Oque?"));
    }
}


