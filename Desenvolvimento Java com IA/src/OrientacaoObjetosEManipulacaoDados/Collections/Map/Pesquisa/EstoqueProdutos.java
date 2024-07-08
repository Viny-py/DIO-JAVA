package OrientacaoObjetosEManipulacaoDados.Collections.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    Map<Long, Produto> estoqueMap;

    public EstoqueProdutos(){
        this.estoqueMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueMap);
    }

    public void exibirProdutoPorCOD(long cod) {
        Produto produtoPorCOD = null;
        if (!estoqueMap.isEmpty()){
            produtoPorCOD = estoqueMap.get(cod);
        }
        System.out.println(produtoPorCOD);
    }

    public double calcularValorTotalEstoque() {
        double valorEstoque = 0d;

        if (!estoqueMap.isEmpty()){
            for (Produto p : estoqueMap.values()){
                valorEstoque += (p.getPreco() * p.getQuantidade());
            }
        }
        return valorEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto p : estoqueMap.values()){
            if (p.getPreco() > maiorPreco){
                maiorPreco = p.getPreco();
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto p : estoqueMap.values()){
            if (p.getPreco() < menorPreco) {
                menorPreco = p.getPreco();
                produtoMaisBarato = p;
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorValorTotal = null;
        double maiorValorTotal = Double.MIN_VALUE;
        for (Produto p : estoqueMap.values()){
            if ((p.getPreco() * p.getQuantidade()) > maiorValorTotal) {
                maiorValorTotal = (p.getPreco() * p.getQuantidade());
                produtoMaiorValorTotal = p;
            }
        }
        return produtoMaiorValorTotal;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1235976, "batata", 150, 3.99);
        estoque.adicionarProduto(2356780, "maca", 5, 1.49);
        estoque.adicionarProduto(2356356, "TV", 1, 499.99);
        estoque.adicionarProduto(2356996, "bala", 100, 0.50);

        System.out.println(estoque.calcularValorTotalEstoque());
        System.out.println(estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
        System.out.println(estoque.obterProdutoMaisCaro());
        System.out.println(estoque.obterProdutoMaisBarato());
        estoque.exibirProdutos();
        estoque.exibirProdutoPorCOD(1235976);
    }
}
