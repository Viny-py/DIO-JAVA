package OrientacaoObjetosEManipulacaoDados.Collections.List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new CompararPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa pessoas = new OrdenacaoPessoa();
        
        pessoas.adicionarPessoa("Viny", 19, 1.75);
        pessoas.adicionarPessoa("Weee", 44, 1.88);
        pessoas.adicionarPessoa("IIIII", 44, 1.63);
        pessoas.adicionarPessoa("Lua", 21, 1.65);
        pessoas.adicionarPessoa("Jay", 18, 1.78);

        System.out.println(pessoas.ordenarPorAltura());
        System.out.println(pessoas.ordenarPorIdade());
    }
}
