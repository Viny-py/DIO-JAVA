package OrientacaoObjetosEManipulacaoDados.Collections.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaset;

    public ListaTarefas() {
        this.tarefaset = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaset.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        Set<Tarefa> tarefaParaRemover = new HashSet<>();

        if (!tarefaset.isEmpty()) {
            for (Tarefa t : tarefaset) {
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover.add(t);
                    break;
                }
            }
        }else{throw new RuntimeException("A lista está vazia!");}
        tarefaset.removeAll(tarefaParaRemover);
    }

    public void exibirTarefas(){
        System.out.println(tarefaset);
    }

    public int contarTarefas(){
        return tarefaset.size();
    }

    public void obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!tarefaset.isEmpty()) {
            for (Tarefa t : tarefaset) {
                if (t.isConcluida()) {
                    tarefasConcluidas.add(t);
                    continue;
                }
            }
        }else{throw new RuntimeException("A lista está vazia!");}
        System.out.println(tarefasConcluidas);
    }

    public void obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!tarefaset.isEmpty()) {
            for (Tarefa t : tarefaset) {
                if (!t.isConcluida()) {
                    tarefasPendentes.add(t);
                    continue;
                }
            }
        }else{throw new RuntimeException("A lista está vazia!");}
        System.out.println(tarefasPendentes);
    }

    public void marcarTarefaConcluida(String descricao){
        if (!tarefaset.isEmpty()){
            for (Tarefa t : tarefaset){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(true);
                    break;
                }
            }
        }else{throw new RuntimeException("A lista está vazia!");}
    }

    public void marcarTarefaPendente(String descricao){
        if (!tarefaset.isEmpty()){
            for (Tarefa t : tarefaset){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(false);
                    break;
                }
            }
        }else{throw new RuntimeException("A lista está vazia!");}
    }

    public void limparListaTarefas(){
        Set<Tarefa> tarefasParaLimpar = new HashSet<>(tarefaset);
        tarefaset.removeAll(tarefasParaLimpar);
    }

    public static void main(String[] args) {
        ListaTarefas tarefa = new ListaTarefas();

        tarefa.adicionarTarefa("Beijar minha namorada");
        tarefa.adicionarTarefa("Fazer compras");
        tarefa.adicionarTarefa("comer feijao");
        tarefa.adicionarTarefa("fazer arroz");

        System.out.println("Quantidade de tarefas: " + tarefa.contarTarefas());
        tarefa.exibirTarefas();

        tarefa.marcarTarefaConcluida("beijar minha namorada");
        tarefa.obterTarefasConcluidas();

        tarefa.removerTarefa("comer feijao");
        tarefa.obterTarefasPendentes();

        
        tarefa.limparListaTarefas();
        tarefa.exibirTarefas();
    }
}
