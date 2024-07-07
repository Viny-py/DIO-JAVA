package OrientacaoObjetosEManipulacaoDados.Collections.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAluno {
    private Set<Aluno> alunoSet = new HashSet<>();

    public void adicionarAluno(String nome, long matricula, double nota){
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;

        if (!alunoSet.isEmpty()){
            for (Aluno a : alunoSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
        }else {throw new RuntimeException("A lista está vazia!");}
        alunoSet.remove(alunoParaRemover);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public Set<Aluno> exibirAlunos(){
        return alunoSet;
    }

    public static void main(String[] args) {
        GerenciadorAluno gerenciador = new GerenciadorAluno();

        gerenciador.adicionarAluno("Vinicius Fonseca Oliveira", 13589, 9.2);
        gerenciador.adicionarAluno("Roberto da Silva Cabral", 13523, 7.3);
        gerenciador.adicionarAluno("Marcos Oliveira", 153589, 6.4);
        gerenciador.adicionarAluno("Maria Eduarda Lima", 19859, 10);
        gerenciador.adicionarAluno("Brenno Manuel de Oliveira", 12576, 3.2);

        System.out.println(gerenciador.exibirAlunos());
        System.out.println(gerenciador.exibirAlunosPorNome());
        System.out.println(gerenciador.exibirAlunosPorNota());

        gerenciador.removerAluno(19859);
        System.out.println(gerenciador.exibirAlunos());
    }
}
