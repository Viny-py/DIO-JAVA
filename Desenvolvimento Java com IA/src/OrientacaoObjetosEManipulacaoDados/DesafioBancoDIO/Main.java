package OrientacaoObjetosEManipulacaoDados.DesafioBancoDIO;

public class Main {
    public static void main(String[] args) {

        Cliente Cliente1 = new Cliente();
        Conta cc = new ContaCorrente(Cliente1);
        Conta cp = new ContaPoupanca(Cliente1);

        Cliente1.setNome("Viny");

        cc.depositar(100);
        cc.transferir(30, cp);

        cc.imprimirEstrato();
        cp.imprimirEstrato();
        
    }
}
