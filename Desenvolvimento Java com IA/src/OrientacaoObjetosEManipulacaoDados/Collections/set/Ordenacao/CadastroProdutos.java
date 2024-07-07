package OrientacaoObjetosEManipulacaoDados.Collections.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProduto(2, "Apple", 2, 1);
        produtos.adicionarProduto(2, "maca", 2, 1);
        produtos.adicionarProduto(3, "Banana", 1, 1);
        produtos.adicionarProduto(1, "Caju", 4, 1);

        System.out.println(produtos.exibirPorPreco());
        System.out.println(produtos.exibirProdutosPorNome());

    }

}
