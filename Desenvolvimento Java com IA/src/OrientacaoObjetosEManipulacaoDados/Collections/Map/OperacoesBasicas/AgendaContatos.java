package OrientacaoObjetosEManipulacaoDados.Collections.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public long pesquisarPorNome(String nome){
        Integer telefonePorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            telefonePorNome = agendaContatoMap.get(nome);
        }
        return telefonePorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Viny", 438928682);
        agenda.adicionarContato("Oativo", 438928682);
        agenda.adicionarContato("alal", 4328682);
        agenda.adicionarContato("mohammed", 45728682);
        agenda.adicionarContato("yousef", 41111232);

        agenda.exibirContato();
        System.out.println(agenda.pesquisarPorNome("Viny"));
        agenda.removerContato("Oativo");
        agenda.removerContato("alal");
        agenda.removerContato("mohammed");
        agenda.exibirContato();
    }
}
