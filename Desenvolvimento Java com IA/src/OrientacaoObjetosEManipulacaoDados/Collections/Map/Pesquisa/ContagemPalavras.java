package OrientacaoObjetosEManipulacaoDados.Collections.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String, Integer> palavrasContagem;

    public ContagemPalavras () {
        this.palavrasContagem = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        palavrasContagem.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        palavrasContagem.remove(palavra);
    }

    public void exibirContagemPalavras(){
        System.out.println(palavrasContagem);
    }

    public String encontrarPalavrasMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavrasContagem.entrySet()) {
          if (entry.getValue() > maiorContagem) {
            maiorContagem = entry.getValue();
            linguagemMaisFrequente = entry.getKey();
          }
        }
        return linguagemMaisFrequente + ", " + maiorContagem;
      }

    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();

        contagem.adicionarPalavra("batata", 2);
        contagem.adicionarPalavra("arroz", 5);
        contagem.adicionarPalavra("feijao", 1);
        contagem.adicionarPalavra("carne", 3);

        contagem.exibirContagemPalavras();
        System.out.println(contagem.encontrarPalavrasMaisFrequente());
    }

}
