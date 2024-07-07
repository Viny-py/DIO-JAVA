package OrientacaoObjetosEManipulacaoDados.Collections.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet =  new HashSet<>();
    }

    public void adicionarConvidado (String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("Vinicius", 7632);
        convidados.adicionarConvidado("Jefferson", 1252);
        convidados.adicionarConvidado("Roberto", 1234);
        convidados.adicionarConvidado("Rafael", 1252);

        convidados.exibirConvidados();
        System.out.println("Quantia de convidados: " + convidados.contarConvidados());

        convidados.removerConvidadoPorCodigo(7632);
        convidados.exibirConvidados();
    }
}
