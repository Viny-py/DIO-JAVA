package OrientacaoObjetosEManipulacaoDados.Collections.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosComNome = new HashSet<>();
        if (!contatoSet.isEmpty()){
            for (Contato c : contatoSet) {
                if (c.getNome().startsWith(nome)){
                    contatosComNome.add(c);
                    //sem break porque o meu set pode ter contatos com o mesmo nome
                }
            }
        }else{throw new RuntimeException("A lista está vazia!");}

        return contatosComNome;
    }

    public void atualizarNumero(String nome, int novoNumero){
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                System.out.println("Numero do contato foi atualizado com sucesso!");
            }
        }
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Viny", 5328975);
        agenda.adicionarContato("Otavio", 5328972);
        agenda.adicionarContato("Barcelona", 5128975);
        agenda.adicionarContato("Otario", 128975);
        agenda.adicionarContato("Otaam", 5128990);

        agenda.exibirContatos();

        agenda.atualizarNumero("Viny", 512);
        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("Ota"));
    }
}
