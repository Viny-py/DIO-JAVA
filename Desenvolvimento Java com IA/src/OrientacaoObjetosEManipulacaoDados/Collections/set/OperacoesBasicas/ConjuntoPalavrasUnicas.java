package OrientacaoObjetosEManipulacaoDados.Collections.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas(){
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        String palavraParaRemover = null;
        if (!palavrasUnicas.isEmpty()){
            for (String p : palavrasUnicas) {
                if (p == palavra) {
                    palavraParaRemover = p;
                    break;
                }else throw new RuntimeException("Esta palavra nao existe no set");
            }
        }else{throw new RuntimeException("O set está vazio!");}
        palavrasUnicas.remove(palavraParaRemover);
    }

    public void verificarPalavra(String palavra){
        if (!palavrasUnicas.isEmpty()){
            for (String p : palavrasUnicas) {
                if (p == palavra){
                    System.out.println("'" + palavra + "' esta no set");
                    break;
                }else{System.out.println("'" + palavra + "' nao esta no set");}
            }
        }else {throw new RuntimeException("A lista está vazia!");}
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicas);
    }

    public int contarPalavrasUnicas(){
        return palavrasUnicas.size();
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((palavrasUnicas == null) ? 0 : palavrasUnicas.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
        if (palavrasUnicas == null) {
            if (other.palavrasUnicas != null)
                return false;
        } else if (!palavrasUnicas.equals(other.palavrasUnicas))
            return false;
        return true;
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();

        conjuntoPalavras.adicionarPalavra("batata");
        conjuntoPalavras.adicionarPalavra("ovo");
        conjuntoPalavras.adicionarPalavra("tomate");
        conjuntoPalavras.adicionarPalavra("aviao");
        conjuntoPalavras.adicionarPalavra("batata");

        conjuntoPalavras.exibirPalavrasUnicas();

        System.out.println(conjuntoPalavras.contarPalavrasUnicas() + " palavras estao presentes no set");
    }

}
