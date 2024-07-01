package OrientacaoObjetosEManipulacaoDados.PilaresPOO.Veiculos;

public class Carro extends Veiculo {
    public void ligar(){
        conferirCambio();
        checarCombustivel();
        System.out.println("Ligando o carro...");
    }

    private void checarCombustivel(){
        System.out.println("Checando o combustivel...");
    }

    private void conferirCambio(){
        System.out.println("Conferindo cambio...");
    }
}
