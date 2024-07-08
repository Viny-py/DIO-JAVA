package OrientacaoObjetosEManipulacaoDados.Collections.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String, String> dicionarioMap;

    public Dicionario(){
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String definicaoPorPalavra = null;
        if (!dicionarioMap.isEmpty()) {
            definicaoPorPalavra = dicionarioMap.get(palavra);
        }
        return definicaoPorPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Batata", "Comidinha gostosa");
        dicionario.adicionarPalavra("alo", "Greeting in portuguese");
        dicionario.adicionarPalavra("nada", "ausencia de algo");
        dicionario.adicionarPalavra("feijao", "Colega do arroz");
        dicionario.adicionarPalavra("Arroz", "Colega do feijao");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Arroz");
        dicionario.removerPalavra("feijao");
        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("alo"));
    }
}
