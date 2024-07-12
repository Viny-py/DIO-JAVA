package OrientacaoObjetosEManipulacaoDados.DesafioBancoDIO;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirEstrato() {
        System.out.println("===== Estrato Conta Poupanca ===== ");
        imprimirInfoConta();
    }
    

}
