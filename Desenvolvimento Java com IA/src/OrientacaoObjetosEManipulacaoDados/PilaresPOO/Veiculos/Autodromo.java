package OrientacaoObjetosEManipulacaoDados.PilaresPOO.Veiculos;

public class Autodromo {
    public static void main(String[] args) {
        Carro fusca = new Carro();
        Moto Kawasaki = new Moto();
        Kawasaki.setChassi("83462");
        fusca.setChassi("467828");
        // fusca.ligar();

        // Kawasaki.ligar();

        Veiculo brabo = fusca;

        fusca.ligar();
    }
}
