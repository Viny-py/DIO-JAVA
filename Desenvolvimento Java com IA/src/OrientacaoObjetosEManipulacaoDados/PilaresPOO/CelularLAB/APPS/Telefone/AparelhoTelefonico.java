package OrientacaoObjetosEManipulacaoDados.PilaresPOO.CelularLAB.APPS.Telefone;

public class AparelhoTelefonico implements Telefone {

    public void ligar(String numero) {
        try {
            verificarNumeroTelefone(numero);
            System.out.println("Ligando para " + numero+ "...");
        }catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void atender(boolean escolha) {
        if (escolha) {
            System.out.println("Atendendo o telefone");
        }else {
            System.out.println("Recusando chamada");
        }
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
       }

    private void verificarNumeroTelefone(String numero){
        if (numero.length() != 15) {
            throw new IllegalArgumentException("Numero de telefone invalido. Digite exatamente 10 numeros.");

        }
    }
    
}
