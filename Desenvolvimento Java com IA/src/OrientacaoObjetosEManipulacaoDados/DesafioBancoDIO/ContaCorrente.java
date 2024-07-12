package OrientacaoObjetosEManipulacaoDados.DesafioBancoDIO;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirEstrato() {
        System.out.println("===== Estrato Conta Corrente ===== ");
        imprimirInfoConta();
    }
    
}
