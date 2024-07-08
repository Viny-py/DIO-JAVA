package OrientacaoObjetosEManipulacaoDados.Collections.Map.Ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosPorData = new TreeMap<>(eventosMap);
        System.out.println(eventosPorData);
    }

    public void obterProximoEvento(){
        Map<LocalDate, Evento> eventosPorData = new TreeMap<>(eventosMap);
        LocalDate dataAtual = LocalDate.now();
        for (Map.Entry<LocalDate, Evento> entry : eventosPorData.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("Proximo evento: " + entry.getValue() + " na data " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.of(2024, 7, 5), "Evento 4", "Atracao 4");
        agenda.adicionarEvento(LocalDate.of(2024, 6, 9), "Evento 1", "Atracao 1");
        agenda.adicionarEvento(LocalDate.of(2024, 7, 19), "Evento 7", "Atracao 7");
        agenda.adicionarEvento(LocalDate.of(2024, 6, 19), "Evento 2", "Atracao 2");
        agenda.adicionarEvento(LocalDate.of(2024, 7, 8), "Evento 5", "Atracao 5");
        agenda.adicionarEvento(LocalDate.of(2024, 6, 27), "Evento 3", "Atracao 3");
        agenda.adicionarEvento(LocalDate.of(2024, 7, 5), "Evento 4", "Atracao 4");
        agenda.adicionarEvento(LocalDate.of(2024, 7, 10), "Evento 6", "Atracao 6");
        agenda.exibirAgenda();
        agenda.obterProximoEvento();   
    }
}
