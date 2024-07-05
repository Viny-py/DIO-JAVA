package OrientacaoObjetosEManipulacaoDados.Collections.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaDeCompras;

    public CarrinhoDeCompras() {
        this.listaDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();

        for (Item i : listaDeCompras){
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        listaDeCompras.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double total = 0;
        for (Item i : listaDeCompras) {
            total = total + (i.getPreco() * i.getQuantidade());
        } 
        return total;
    }

    public void exibirItens(){
        System.out.println(listaDeCompras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("batatas", 4.50, 4);
        carrinho.adicionarItem("tomates", 2, 3);
        carrinho.adicionarItem("TV", 2500, 1);
        carrinho.removerItem("batatas");
        carrinho.exibirItens();
        System.out.println("Valor total: $"+carrinho.calcularValorTotal());
    }

}
