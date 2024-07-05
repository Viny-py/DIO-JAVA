package OrientacaoObjetosEManipulacaoDados.Collections.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> TarefaList;

    public ListaTarefa() {
        this.TarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        TarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa t : TarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        TarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return TarefaList.size();
    }
    
    public void obterDescricoesTarefas(){
        System.out.println(TarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listatarefa = new ListaTarefa();

        System.out.println(listatarefa.obterNumeroTotalTarefas());
        listatarefa.adicionarTarefa("Tarefa 1");
        listatarefa.adicionarTarefa("Tarefa 2");
        listatarefa.adicionarTarefa("Tarefa 1");
        listatarefa.adicionarTarefa("Tarefa 3");

        System.out.println(listatarefa.obterNumeroTotalTarefas());

        listatarefa.removerTarefa("tarefa 2");
        System.out.println(listatarefa.obterNumeroTotalTarefas());

        listatarefa.obterDescricoesTarefas();

    }
}
